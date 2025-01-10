# Bean Counter Application
This project is a simple Spring Boot application that counts the number of beans defined in the application context. It exposes this information through a REST API.

## **Introduction:**
The Bean Counter Application is designed to demonstrate how to count the beans in a Spring application context. It uses Spring Boot for rapid setup and configuration and includes a RESTful endpoint to expose the bean count.

## **Features:**
Counts the total number of beans in the context of the application.
Exposes a REST endpoint to retrieve the bean count.
Utilizes Spring Boot's CommandLineRunner to print the bean count at startup.
## **Installation:**
To install and run the application locally:
## 1-Clone the repository:
    ```bash
    git clone https://github.com/zgokceaynaci/Bean-Counter.git
    cd bean-counter
    
## 2-Build the application using Maven:
mvn clean install

## 3-Run the application:
mvn spring-boot:run

## **Usage:**
Once the application runs, it will automatically count the number of beans and print this information to the console. You can also retrieve the bean count via the exposed REST API.

## **Endpoints:**
GET /bean-count: Returns the total number of beans in the context of the application.
## Example request:
curl -X GET http://localhost:8080/bean-count
## Example response:
42

## **Technologies Used:**
-**Java**
-**Spring Boot**
-**Maven**
