[![verify](https://github.com/bootique-examples/bootique-swagger-demo/actions/workflows/verify.yml/badge.svg)](https://github.com/bootique-examples/bootique-swagger-demo/actions/workflows/verify.yml)

# bootique-swagger-demo

A few sample apps demonstrating how to use [Bootique Swagger](https://github.com/bootique/bootique-swagger) to document
REST APIs. The main example is `bootique-swagger-openapi3-demo` that demonstrates the use of
[OpenAPI](https://swagger.io/docs/specification/about/).


## Prerequisites
* Java 1.8 or newer.
* Apache Maven.

## Build

```
git clone https://github.com/bootique-examples/bootique-swagger-demo.git
cd bootique-swagger-demo
mvn package
```

## Run

Enter the following to launch application with default url to swagger.json:
```
java -jar bootique-swagger-openapi3-demo/target/bootique-swagger-openapi3-demo-2.0-SNAPSHOT.jar --server
```

After launching the app, check the following URLs:

* Example REST API: http://127.0.0.1:8080/api
* Swagger Web console: http://127.0.0.1:8080/swagger-ui
* Swagger model as JSON: http://127.0.0.1:8080/openapi.json
* Swagger model as YAML: http://127.0.0.1:8080/openapi.yaml



