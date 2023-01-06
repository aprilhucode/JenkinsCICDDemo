FROM openjdk:8
EXPOSE 8081
ADD target/jenkins-cicd-demo.jar jenkins-cicd-demo.jar
ENTRYPOINT ["java","-jar","jenkins-cicd-demo.jar"]