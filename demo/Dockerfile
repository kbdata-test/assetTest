FROM maven:3.5-jdk-8-alpine as builder

WORKDIR bootProj/demo
COPY demo/pom.xml .
COPY demo/src ./src

RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim

COPY --from=builder bootProj/demo/target/demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/demo-0.0.1-SNAPSHOT.jar"]