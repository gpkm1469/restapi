# Start with a base image - in this case JDK 8 Alpine
FROM openjdk:11-jdk-slim
ADD target/restapi-0.0.1-SNAPSHOT.jar /app.jar
ENV MAX_RAM_PERCENTAGE="50.0"
ENV TIMEZONE="UTC"
CMD ["bash", "-c", "java -XX:MaxRAMPercentage=$MAX_RAM_PERCENTAGE -Duser.timezone=$TIMEZONE -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]