# javaday-quarkus

https://code.quarkus.io/

```
mvn compile quarkus:dev
```

```
mvn quarkus:add-extension -Dextensions="openapi"
```
```
mvn clean 
mvn package
docker build -t javaday-quarkus .
docker run --rm -d -p 8082:8082 --name quarkus javaday-quarkus
docker stop quarkus
```
