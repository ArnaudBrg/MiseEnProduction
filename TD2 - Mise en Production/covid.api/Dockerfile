
FROM eclipse-temurin:17-jre-jammy

RUN mkdir /opt/app
COPY ./build/libs/covid.api-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/covid.api-0.0.1-SNAPSHOT.jar"]


