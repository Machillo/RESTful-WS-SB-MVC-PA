# Project: Implementation of API Calls and Deployment on Amazon AWS Cloud

## Description

This project is a complete RESTful API developed in Java using Spring Boot. The API provides functionalities for user sign-up, sign-in, email verification, password reset, user update, and user deletion. The application is designed to be secure and efficient, and it utilizes token-based authentication to protect sensitive endpoints.

## Technologies Used

- Java
- Spring Boot
- Maven
- MySQL
- Amazon AWS (Amazon EC2, Amazon RDS)

## Features

- User registration with email validation.
- User login with token-based authentication.
- Email verification for ensuring valid accounts.
- Password reset for forgetful users.
- User information update.
- Safe deletion of user accounts.

## Deployment on Amazon AWS Cloud

The application is hosted on Amazon AWS Cloud. I used Amazon EC2 to deploy the virtual servers and Amazon RDS to host the MySQL database in the cloud. Deployment in the cloud ensures scalability, high availability, and reliable performance.

## Usage Instructions

1. Clone this repository to your local machine.

```bash
git clone https://github.com/YourUsername/YourProject.git

Import the project into your preferred IDE (e.g., Eclipse or IntelliJ).

Configure the MySQL database using the appropriate credentials in the application.properties file.

Run the application from your IDE or from the command line using Maven.

bash
Copy code
mvn spring-boot:run
The API will be available at http://localhost:8080. You can use tools like Postman to test the different endpoints.

Contact
If you have any questions or suggestions about the project, feel free to contact me through LinkedIn or email.

LinkedIn: Kenneth Alvarado
Email: gatorico992gmail.com
