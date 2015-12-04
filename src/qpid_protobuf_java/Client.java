package qpid_protobuf_java;

import javax.jms.Message;

import org.apache.qpid.client.message.JMSBytesMessage;
import maxtrack.pb.mxt1xx.Mxt1Xx.mxt1xx_u_position;
import maxtrack.pb.commands.Commands.u_command;
import maxtrack.pb.commands.Commands.u_command.Builder;
import maxtrack.pb.commands.Commands.u_command_response;
import maxtrack.pb.commands.Commands.u_parameter;

public class Client {

	public static void main(String[] args) {
		String broker_ip = "192.168.0.78";
		String broker_port = "5672";
		String data_queue = "fila_dados_ext";
		String command_queue = "mxt_command_qpid";
		boolean response_received = true;
		boolean exit = false;

		try {
			Qpid qpidClient = new Qpid();
			qpidClient.connect(broker_ip, broker_port, data_queue, command_queue);

			while (!exit) {
				Message message = qpidClient.getMessageConsummer().receive();
				JMSBytesMessage msg = (JMSBytesMessage) message;
				byte[] byteA = new byte[(int) msg.getBodyLength()];
				msg.readBytes(byteA, (int) msg.getBodyLength());

				switch (QpidTypes.valueOfBySubjectDescription(message.getStringProperty("qpid.subject"))) {
				case qpid_st_pb_mxt1xx_pos:
					mxt1xx_u_position pos = mxt1xx_u_position.parseFrom(byteA);
					System.out.println(pos.toString());
					message.acknowledge();
					if (response_received)
						response_received = mxt1xx_output_control(!pos.getHardwareMonitor().getOutputs().getOutput1(),
								pos, qpidClient);
					break;
				case qpid_st_pb_command_response:
					u_command_response res = u_command_response.parseFrom(byteA);
					System.out.println(res.toString());
					message.acknowledge();
					if (res.getStatus() == 5) {
						System.out.println("Command response: Success");
						response_received = true;
					} else
						System.out.println("Command response: " + res.getStatus());

					break;
				default:
					message.acknowledge();
					break;

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean mxt1xx_output_control(boolean activate, mxt1xx_u_position pos, Qpid qpidClient) {
		try {
			int aux = activate ? 1 : 0;
			Builder command = u_command.newBuilder();

			command.setProtocol(pos.getFirmware().getProtocol());
			command.setSerial(pos.getFirmware().getSerial());
			command.setId("Controla Saida " + pos.getFirmware().getSerial());
			command.setType(51);
			command.setAttempt(50);
			command.setTimeout("2020-12-31 00:00:00");
			// type 2 para protobuf
			command.setHandlerType(2);
			command.setTransport("GPRS");

			u_parameter.Builder parameter = u_parameter.newBuilder();

			parameter.setId("SET_OUTPUT");
			parameter.setValue("1");
			command.addParameter(parameter);

			parameter.setId("SET OUTPUT 1");
			parameter.setValue(String.valueOf(aux));
			command.addParameter(parameter);

			parameter.setId("SET OUTPUT 2");
			parameter.setValue(String.valueOf(aux));
			command.addParameter(parameter);

			parameter.setId("SET OUTPUT 3");
			parameter.setValue(String.valueOf(aux));
			command.addParameter(parameter);

			parameter.setId("SET OUTPUT 4");
			parameter.setValue(String.valueOf(aux));
			command.addParameter(parameter);

			// adicionando o comando na fila
			maxtrack.pb.commands.Commands.u_command novoComando = command.build();
			Message messss = qpidClient.getSession().createMessage();
			messss.setStringProperty("qpid.subject", "PB_COMMAND");
			JMSBytesMessage jmsMess = (JMSBytesMessage) messss;
			jmsMess.writeBytes(novoComando.toByteArray());
			qpidClient.getMessageProducer().send(jmsMess);
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}

}
