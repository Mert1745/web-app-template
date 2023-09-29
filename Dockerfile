FROM amazoncorretto:17-alpine-jdk
COPY target/web-app-template-0.0.1-SNAPSHOT.jar web-app-template-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/web-app-template-0.0.1-SNAPSHOT.jar"]