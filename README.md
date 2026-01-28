# GitHub Exercise – Week 2

This repository contains two POCs:
- Spring Boot
- Dropwizard

How to run Spring Boot POC -
1. Build the project: mvn clean package
2. Run the application: mvn spring-boot:run
3. Test EndPoint : https://localhost:8080/users/1

How to run DropWizard POC - 
1.Build the JAR: mvn clean package
2. Run the service: java -jar target/<jar-name>.jar server config.yml
3. Test endpoint: hhtp://localhost:8080/hello?name=xyz
