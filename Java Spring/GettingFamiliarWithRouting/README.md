# Getting Familiar with Routing

For this assignment, you are going to practice routes in Spring Boot. The goal is to master writing method level @RequestMapping annotations and @RequestMapping class level annotation

## Objectives:
* Practice creating a Spring Boot application.
* Practice @RestController annotation
* Master @RequestMapping.

## Tasks:
* Create a controller named 'CodingController'. For the first 3 routes, use the @RequestMapping annotation.
* Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.
* Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.
* Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.
* Create another controller named 'DojoController'. For the routes below, use the @PathVariable annotation.
* Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
* Have an http GET request to 'http://localhost:8080/burbank-dojo/' display a text that says 'Burbank Dojo is located in Southern California'.
* Have an http GET request to 'http://localhost:8080/san-jose/' display a text that says 'SJ dojo is the headquarters'.
