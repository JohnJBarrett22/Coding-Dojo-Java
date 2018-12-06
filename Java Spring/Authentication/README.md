# Authentication

Create a brand new project named authentication and add the following dependencies:

* spring-boot-starter-jpa
* spring-boot-starter-web
* devtools (optional)
* mysql-connector-java (runtime)
* tomcat-embed-jasper
* jstl
* NEW: jbcrypt

The jbcrypt dependency is the Java BCrypt implementation. This is how your pom.xml file should look like:

## Domain Models and Repositories
For this application, we are going to create a simple user model. Create a schema named authentication in MySQL and update the application.properties file accordingly.

## User Model
In our application, our users will have a email, password and passwordConfirmation attributes. Note that we have the @Transient attribute for the passwordConfirmation member variable. This means that passwordConfirmation will not be saved in the database, and solely used for validation.

## Repositories
In the UserRepository, create a method that retrieves a specific user by their email.

## Service and BCrypt
We already installed the BCrypt dependency. The only thing we have to do now is to write our methods to register and authenticate users. Since this is the business logic of our application, the code should live in the service.

That's it! Super simple. Next, we will be implementing the controller and the views.
