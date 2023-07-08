# Running a multi-container application


* This application is a Spring boot application which uses MongoDB for persistence.
* Here one container is the Spring boot web application and the other container is the MongoDB.

## Steps to run this application (the containers):

* Build the application --> 'mvn clean package'
* We can use either of the below two techniques to create the containers.
* STEP-1: Manual technique using network
  * Create a network ---> **docker network create mongo-net**
  * Pull mongo image from docker hub ---->  **docker pull mongo:latest**
  * Run mongo image  ----> **docker run -p 27017:27017 --name hr-mongodb --network mongo-net mongo:latest**
  * Dockerize (Create image of) spring boot application ------> **docker build -t springboot-mongo-app:1.0.0 .**
  * Run spring boot docker image and link the container to mongo container -----> **docker run -p 8001:8007 --name springboot-mongo-app --network mongo-net springboot-mongo-app:1.0.0**
  * Check docker running containers -----> **docker ps** (Both these containers should be present by now)
* STEP-2: Using docker-compose
  * Dockerize(Create image of) spring boot application ------> **docker build -t springboot-mongo-app:1.0.0 .**
    * Note: We don't need to create image of the MongoDB as it is already available.
  * Run the command from the directory where this docker-compose.yml file is present.  ---> **docker-compose up**
    * Note: We define these two services (web-app & MongoDB) in ‘docker-compose.yml’ file.
  * Check docker running containers -----> **docker ps** (Both these containers should be present by now)

  
### Port mappings:

* server.port (application.yml) = X
  * The container listens on the 'X' port.
* ports (docker-compose.yml) = Y:X
  * The host port 'Y' listens to the exposed port 'X' of the container







