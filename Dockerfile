FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre
RUN groupadd -r appuser && useradd -r -g appuser appuser

WORKDIR /app
COPY --from=build /app/target/*.war app.war
RUN chown -R appuser:appuser /app

USER appuser
EXPOSE 8080
CMD ["java", "-jar", "app.war"]
