# qpid_protobuf_java

Projeto de exemplo Java para conexão em uma fila no Qpid para obter dados e deserializar estes dados no formato protobuf.

- AMQP 0-10 (Qpid 0.24) e Google Protobuf 2.5.0

## [Dependências] ##
(Maven)

- org.apache.qpid
- org.apache.geronimo.specs
- com.google.protobuf

## [Protobuf] ##
Para gerar as classes do protobuf, baixe o arquivo 
[https://github.com/google/protobuf/releases/download/v2.5.0/protoc-2.5.0-win32.zip](https://github.com/google/protobuf/releases/download/v2.5.0/protoc-2.5.0-win32.zip)

Coloque na pasta proto.
Para gerar as classes utilize o comando abaixo pelo prompt de comando na pasta proto

	protoc.exe ProtoFiles\mxt1xx.proto --java_out=java

Copie a pasta gerada para a pasta source.

## [Maven] ##
Para fazer com que o Maven gere o .jar altere a versão do jdk no pom.xml para a versão disponível em seu sistema. Ex:

	# javac -version
	javac 1.7.0_91

pom.xml

	<source>1.7</source>
	<target>1.7</target> 

Altere também a mainclass mo pom.xml se necessário

	<plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-jar-plugin</artifactId>
		<version>2.4</version>
		<configuration>
		  <archive>
			<manifest>
			<addClasspath>true</addClasspath>
			<mainClass>qpid_protobuf_java.Qpid</mainClass>
			<classpathPrefix>dependency-jars/</classpathPrefix>
			</manifest>
		  </archive>
		</configuration>
	</plugin>