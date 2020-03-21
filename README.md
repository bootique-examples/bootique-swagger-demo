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
Enter the following to launch application with default url to swagger.json:

```bash
java -jar target/bootique-swagger-demo-1.1-SNAPSHOT.jar
```

Enter the following to launch app with custom url to swagger.json configured in yml file:

```bash
java -jar target/bootique-swagger-demo-1.1-SNAPSHOT.jar --config=classpath:customUrl.yml
```

After launching the app, go to

1. http://localhost:9999/api Get hello page
2. http://localhost:9999/swagger.json Documented by swagger application api as JSON
3. http://localhost:9999/swagger.yaml Documented by swagger application api as YAML
3. http://localhost:9999/swagger Swagger Web console
4. http://localhost:9999/static Static resources



