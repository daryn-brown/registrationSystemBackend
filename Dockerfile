FROM openjdk:17-jdk
COPY ./target/registrationsystem-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
