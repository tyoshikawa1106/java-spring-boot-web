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
