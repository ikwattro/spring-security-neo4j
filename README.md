## Spring Custom Authentication Provider with Neo4j

Launch Neo4j : 

```
docker-compose up -d
```

Create a user node : 

```
CREATE (n:User {name: 'john', password: 'doe'})
```

Launch the app

```
mvn spring-boot:run
```

Make a request : 

```
$ curl --user john:doe http://localhost:8080/hello -v

Hello, you are connected as john
```