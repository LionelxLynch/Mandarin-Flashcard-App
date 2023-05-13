# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn package -DskipTests

# Run stage
FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/mandarin-flashcard-application-0.0.1-SNAPSHOT.jar /app/mandarin-flashcard-application.jar
ENV PORT=8080
EXPOSE ${PORT}
CMD ["java", "-jar", "/app/mandarin-flashcard-application.jar"]
