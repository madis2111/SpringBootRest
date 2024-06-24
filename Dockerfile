FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD target/SpringBootRest-0.0.1-SNAPSHOT.jar /SpringBootRestDocker/SpringBootRestDocker.jar

ENTRYPOINT ["java", "-jar", "/SpringBootRestDocker/SpringBootRestDocker.jar"]