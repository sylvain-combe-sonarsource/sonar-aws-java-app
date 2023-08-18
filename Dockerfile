FROM public.ecr.aws/docker/library/eclipse-temurin:latest
EXPOSE 8080
ARG JAR_FILE=target/aws-sonar-demo-1.1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
