# Identity Server with Spring Security and MongoDB

This repository contains an implementation of an Identity Server using Spring Security and MongoDB. The Identity Server serves as a centralized authentication and authorization system, implementing JWT authentication, access token, and refresh token functionality.

## Features

- User registration and authentication using JWT
- Access token generation and management
- Refresh token support for obtaining new access tokens
- Role-based authorization
- User profile management
- Integration with MongoDB for data storage

## Prerequisites

Before running the Identity Server, make sure you have the following prerequisites installed:
- Java Development Kit (JDK) version 17.0.7 or later
- Apache Maven
- MongoDB



## Security Protection Against Exploits
- __Cross-Site Request Forgery (CSRF) Protection:__ Spring Security provides CSRF protection by default. It automatically adds a unique token for that user session, ensuring that requests originated from your application are not forged by malicious websites or attackers.
- __Cross-Site Scripting (XSS) Protection:__ Spring Security helps prevent XSS attacks by automatically escaping user input and output. This ensures that user-supplied data is properly encoded before being rendered in HTML responses, reducing the risk of executing malicious scripts.
- __Request Rate Limiting:__ Spring Security allows you to configure request rate limiting to prevent abuse or brute-force attacks. You can configure the maximum number of requests allowed within a certain time period, helping to mitigate the impact of such attacks.
- __Authentication and Authorization:__ Spring Security offers comprehensive authentication and authorization mechanisms to protect your application from unauthorized access. It supports various authentication methods (e.g., form-based, OAuth, JWT) and fine-grained access control through roles and permissions.
## Getting Started

To set up and run the Identity Server, follow these steps:

`1.` Clone the repository:

```bash
  git clone https://github.com/shantanuvidhate/Identity-Server.git
```
`2.`  Navigate to the project directory:

```bash
  cd identity-server
```
`3.`  Build the project using Maven:

```bash
  mvn clean install
```
`4.`  Configure the MongoDB connection:

Open the `src/main/resources/application.properties` file and modify the following properties according to your MongoDB configuration:

```bash
  spring.data.mongodb.host=localhost
  spring.data.mongodb.port=27017
  spring.data.mongodb.database=users
```
`5.`  Run the application:

```bash
  mvn spring-boot:run
```
    
## Usage

Once the Identity Server is running, you can use the following endpoints to interact with it:

- **User Login**: `POST http://localhost:8080/auth/login`
- Use this endpoint to authenticate a user and obtain an JWT token. Send username and password in body in JSON format.

- **User List**: `GET http://localhost:8080/home/users`
- Use this endpoint to retrieve the user's list information. Send obtained JWT token in header with key as `Authorization` and value as `Bearer {JWTToken}`


Protected endpoints require a valid access token in the `Authorization` header with the value `Bearer {accessToken}`.

For further details on request and response formats, refer to the API documentation or code comments.




### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)






## License

This project is licensed under the [MIT License](https://github.com/shantanuvidhate/Identity-Server/blob/main/LICENSE).

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://github.com/shantanuvidhate/Identity-Server/blob/main/LICENSE)
