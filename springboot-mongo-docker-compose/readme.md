Running a multi-container application
--------------------------------------

The following techniques can be used to achieve this.

**1. Docker Link**

_Steps & Commands_

 * Pull mongo image from docker hub ---->  docker pull mongo:latest
 * Run mongo image  ----> docker run -d -p 27017:27017 --name hr-mongodb -d mongo:latest
 * Dockerize spring boot application ------> docker build -t springboot-mongodb-app:1.0 .
 * Run spring boot docker image and link the container to mongo container -----> docker run -p 8080:8080 --name springboot-mongodb-app --link hr-mongodb -d springboot-mongodb-app:1.0
 * Check docker running containers -----> docker ps (Both these containers should be present by now)


**2. Docker Compose**
* Here we define the services and the link between them in ‘docker-compose.yml’ file.
* Then we run the application using the below command from the directory where this docker-compose.yml file is present.
  *  docker-compose up




