FROM 172.20.17.99:81/base/java:8-jdk-alpine
WORKDIR /data
COPY ./rpc-client.jar /data/rpc-client.jar
CMD ["java","-jar","/data/rpc-client.jar"]
