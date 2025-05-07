FROM public.ecr.aws/docker/library/maven:3.9-eclipse-temurin-17 AS BUILDER
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package

FROM public.ecr.aws/docker/library/eclipse-temurin:17
WORKDIR /app
COPY --from=BUILDER /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]