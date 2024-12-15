# Use a lightweight base image with JRE
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot jar to the container
COPY target/github-action-snapshot.jar github-action-snapshot.jar

# Expose the application port (default 8080 for Spring Boot)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "github-action-snapshot.jar"]
