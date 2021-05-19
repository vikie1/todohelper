# Introduction
This project is a todolist backend in java but also encomapses both short term and long term projects

# Technologies
1. Maven
2. Spring Boot
3. Postgresql database

## Requirements
1. Maven (version => Apache Maven 3.6.3)
2. Java (version 11 => is recommended), (edit pom.xml) to change the java version.
3. Postgresql database instance (version = 13 recommended)

# Installation
$ git clone git clone https://github.com/vikie1/todohelper.git && cd todohelper

# launch in windows
> ./mvnw.cmd spring-boot:run

# lunch in *nix or *nix like 
$ ./mvnw spring-boot:run

# Usage(Need To Know)
This package runs on port 8080. <br>
You can read and edit the source code from src/main/java/ <br>
Edit the database url, username and password in src/main/resources/application.properties <br>
The application uses spring Jpa for data source so you wont have to create the tables manually <br>
The applictions output is inform of JSON so you'll need a functional frontend <br>

# Runtime Resources
## todolist items
*All resources will be empty on first run* <br>
GET localhost:8080/todolist -> will return all the saved todo lists <dr>
POST localhost:8080/todolist -> accepts todolists in the form of a JSON containing {"name" :" your   value ", "time" : "your value"} timestamps for all items must be unique <br>
DELETE localhost:8080/todolist/{a timestamp here} -> Will delete a todolist with the specified time.  *deleting a todolist will assume you handled it so its automatically saved as a progress* <br>

## Other actions
GET localhost:8080/wins  <br>
POST localhost:8080/wins/big <br>
DELETE localhost:8080/wins/{name of the win} <br>
POST localhost:8080/wins/medium <br>
DELETE localhost:8080/wins/medium/{name of the win} <br>
POST localhost:8080/wins/small <br>
DELETE localhost:8080/wins/small/{name of the win} <br>

GET localhost:8080/projects <br>
POST localhost:8080/projects/longterm <br>
DELETE localhost:8080/projects/longterm/{name of the win} <br>
POST localhost:8080/projects/midterm <br>
DELETE localhost:8080/projects/midterm/{name of the win} <br>
POST localhost:8080/projects/shorterm <br>
DELETE localhost:8080/projects/shorterm/{name of the win} <br>
GET localhost:8080/projects -->Deletes all projects <br>

GET localhost:8080/progress <br>
POST localhost:8080/progress/current <br>
POST localhost:8080/progress/weekly <br>
POST localhost:8080/progress/daily <br>
DELETE localhost:8080/progress  --> clears all the progress <br>