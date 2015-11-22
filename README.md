# java-spring-boot-web
###Create .gitignore
```
$ gibo OSX Windows SublimeText Java >> .gitignore
```

###Create Project
```
$ mvn -B archetype:generate -DgroupId=com.example -DartifactId=SpringBootWeb -Dversion=1.0.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart
```

###Run
```
$ mvn spring-boot:run
```

or 

```
$ mvn clean
$ mvn package
$ java -jar target/SpringBootWeb-1.0.0-SNAPSHOT.jar
```

###API
```
$ curl http://localhost:8080/api/customers -v -X GET
```

```
$ curl http://localhost:8080/api/customers/1 -v -X GET
```

```
$ curl http://localhost:8080/api/customers -v -X POST -H "Content-Type: application/json" -d "{\"firstName\" : \"Tamako\", \"LastName\" : \"Nobi\"}"
```