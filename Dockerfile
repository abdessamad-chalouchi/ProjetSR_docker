# -----------------------------
# STAGE 1: Build the application
# -----------------------------
FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app
# Copy only pom first (better caching)
COPY pom.xml .
# Download dependencies (cached layer)
RUN mvn dependency:go-offline
# Copy source code
COPY src ./src
# Build the application (skip tests for speed)
RUN mvn clean package -DskipTests

# -----------------------------
# STAGE 2: Run the application
# -----------------------------
FROM eclipse-temurin:21-jdk
RUN apt-get update && apt-get install -y curl
WORKDIR /app
# Copy ONLY the built jar from previous stage
COPY --from=builder /app/target/*.jar app.jar
# Expose Spring Boot port
EXPOSE 9090
# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
