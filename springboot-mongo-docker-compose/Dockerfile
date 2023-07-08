FROM openjdk:17-oracle
WORKDIR /app-dir
ADD target/springboot-mongo-docker-compose-1.0.0.jar /app-dir/app.jar
ENTRYPOINT ["java","-jar","/app-dir/app.jar"]