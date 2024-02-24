FROM openjdk:22-jdk
COPY target/students-app.jar students-app.jar 
ENTRYPOINT ["java","-jar","/students-app.jar"]