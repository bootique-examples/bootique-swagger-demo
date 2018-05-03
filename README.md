# bootique-swagger-demo

Simple [Bootique](http://bootique.io) app demonstrating the Bootique Swagger api documentation module.

# Prerequisites
* Java 1.8 or newer.
* Apache Maven.

# Build the demo

```
git clone https://github.com/bootique-examples/bootique-swagger-demo.git
cd bootique-swagger-demo
mvn package
```
Enter the following to launch the app in Maven.

```bash
java -jar target/bootique-swagger-demo-1.0-SNAPSHOT.jar
```

After launching the app, go to

1. http://localhost:9999/api Get hello page
2. http://localhost:9999/swagger.json Documented by swagger application api as JSON
3. http://localhost:9999/swagger.yaml Documented by swagger application api as YAML
3. http://localhost:9999/swagger-ui Swagger Web console



