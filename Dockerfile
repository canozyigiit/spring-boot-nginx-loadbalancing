FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/spring-boot-nginx-loadbalancing-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]