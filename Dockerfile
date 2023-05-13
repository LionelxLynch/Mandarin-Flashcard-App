# Build stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

# Copy the JAR file to the current directory
COPY ./target/mandarin-flashcard-application-0.0.1-SNAPSHOT.jar .

# Run stage
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/mandarin-flashcard-application-0.0.1-SNAPSHOT.jar .
ENV PORT=8080
EXPOSE ${PORT}
CMD ["java", "-jar", "./mandarin-flashcard-application-0.0.1-SNAPSHOT.jar"]
