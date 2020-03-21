# bootique-swagger-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Swagger api documentation module. 

_For Bootique 1.x example, switch to [1.x branch](https://github.com/bootique-examples/bootique-swagger-demo/tree/1.x) of this demo._

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

* Example REST API: http://127.0.0.1:8080/api
* Swagger Web console: http://127.0.0.1:8080/swagger-ui
* Swagger model as JSON: http://127.0.0.1:8080/swagger.json
* Swagger model as YAML: http://127.0.0.1:8080/swagger.yaml



