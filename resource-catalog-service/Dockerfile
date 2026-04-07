# Stage 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia il pom e scarica le dipendenze (ottimizza la cache)
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia i sorgenti e builda
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Prendi il jar generato nello stage precedente
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]