# bootique-swagger-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Swagger api documentation module. 

_For Bootique 1.x example, switch to [1.x](https://github.com/bootique-examples/bootique-swagger-demo/tree/1.x) branch of this demo._

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```
git clone https://github.com/bootique-examples/bootique-swagger-demo.git
cd bootique-swagger-demo
mvn package
```
Enter the following to launch application with default url to swagger.json:

```bash
java -jar target/bootique-swagger-demo-1.1-SNAPSHOT.jar --server
```

Enter the following to launch app with custom url to `swagger.json` configured in yml file:

```bash
java -jar target/bootique-swagger-demo-1.1-SNAPSHOT.jar --server --config=customUrl.yml
```

After launching the app, check the following URLs:

* Example REST API: http://localhost:8080/api
* Swagger Web console: http://localhost:8080/swagger
* Swagger model in JSON: http://localhost:8080/swagger.json
* Swagger Model in YAML: http://localhost:8080/swagger.yaml



