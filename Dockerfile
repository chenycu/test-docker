FROM java:8
VOLUME /tmp
COPY target/docker-0.0.1-SNAPSHOT.jar spring-docker.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","/spring-docker.jar"]