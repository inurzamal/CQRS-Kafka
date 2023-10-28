## CQRS Design Pattern: 
Separate the Read operation & Write operation in different services and Sync the services using Message Queue:
<img width="902" alt="image" src="https://github.com/inurzamal/CQRS-Kafka/assets/18715701/0c17074d-738d-4f2a-9cc4-dfb58eabff97">


# CQRS-Kafka



start zoo keeper: bin\windows\zookeeper-server-start.bat config/zookeeper.properties <br>
start kafka: bin\windows\kafka-server-start.bat config/server.properties

Next: use UUIDs generated in the command and used in the consumer of the query


