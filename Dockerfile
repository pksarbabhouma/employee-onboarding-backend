FROM maven:3.9-eclipse-temurin-17 AS BUILDER
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM eclipse-temurin:17-ubi9-minimal
WORKDIR /app
COPY --from=BUILDER /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]