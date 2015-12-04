# qpid_protobuf_java

Projeto de exemplo Java para conexão em uma fila no Qpid para obter dados e deserializar estes dados no formato protobuf.

- AMQP 0-10 (Qpid 0.24) e Google Protobuf 2.5.0

## [Dependências] ##
- org.apache.qpid
- org.apache.geronimo.specs

## [Protobuf] ##
Para gerar as classes do protobuf, baixe o arquivo 
[https://github.com/google/protobuf/releases/download/v2.5.0/protoc-2.5.0-win32.zip](https://github.com/google/protobuf/releases/download/v2.5.0/protoc-2.5.0-win32.zip)

Coloque na pasta proto.
Para gerar as classes utilize o comando abaixo pelo prompt de comando na pasta proto

	protoc.exe ProtoFiles\mxt1xx.proto --java_out=java

Copie a pasta gerada para a pasta source.