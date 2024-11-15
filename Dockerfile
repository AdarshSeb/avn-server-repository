FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-alpine
COPY --from=build /target/*.jar demo.jar
COPY ca.pem /etc/ssl/certs/ca.pem
EXPOSE 8080
ENTRYPOINT ["java","-Djavax.net.ssl.trustStore=/etc/ssl/certs/ca.pem", "-Djavax.net.ssl.trustStorePassword=changeit", "-jar", "demo.jar"]
