package qpid_protobuf_java;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import org.apache.qpid.client.AMQConnection;
import org.apache.qpid.client.AMQConnectionFactory;
import org.apache.qpid.client.AMQQueue;
import org.apache.qpid.client.AMQSession;
import org.apache.qpid.url.URLSyntaxException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Fred
 */
public class Qpid {

	private AMQConnectionFactory connectionFactory;
	private AMQConnection connection;
	@SuppressWarnings("rawtypes")
	private AMQSession session;
	private MessageConsumer messageConsumer;
	private MessageProducer messageProducer;
	private Destination destination, destinationCommands;
	private boolean status;
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Qpid.class);

	public void qpid() {
		status = false;
	}

	public MessageConsumer getMessageConsummer() {
		return messageConsumer;
	}

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	@SuppressWarnings("rawtypes")
	public AMQSession getSession() {
		return session;
	}

	@SuppressWarnings("rawtypes")
	public boolean connect(String brokerIP, String brokerPort, String filaDados, String filaComandos) throws Exception {
		try {
			boolean result;
			connectionFactory = new AMQConnectionFactory("amqp://guest:guest@clientid/test?brokerlist='tcp://"
					+ brokerIP + ":" + brokerPort + "?sasl_mechs='ANONYMOUS''");
			connection = (AMQConnection) connectionFactory.createConnection();
			connection.start();

			session = (AMQSession) connection.createSession(false, Session.CLIENT_ACKNOWLEDGE);

			destinationCommands = new AMQQueue(filaComandos);
			messageProducer = session.createProducer(destinationCommands);

			destination = new AMQQueue(connection, filaDados);
			messageConsumer = session.createConsumer(destination);

			result = true;
			return result;
		} catch (URLSyntaxException | JMSException ex) {
			logger.error(null, ex);
			throw ex;
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public boolean getStatus() {
		status = !connection.isClosed();
		return status;
	}

	public void disconnect() throws Exception {
		try {
			connection.stop();
		} catch (Exception e) {
			throw e;
		}
	}
}
