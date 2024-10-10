FROM openjdk:18
WORKDIR /app
COPY ./target/SpringDockerExample-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
CMD [ "java","-jar","SpringDockerExample-0.0.1-SNAPSHOT.jar" ]
