<h1 align="center">
  Canary Release
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@giulianabezerra&color=8257E5&labelColor=000000" alt="@giulianabezerra" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Demo&color=8257E5&labelColor=000000" alt="Demo" />
</p>

Esta é uma demo apresentada [nesse vídeo](https://youtu.be/3RAoM3PPD_U) que demonstra como implementar release canário utilizando Spring Cloud Gateway. 


## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)

## Como Executar

- Clonar repositório git:
```
git clone https://github.com/giuliana-bezerra/canary-release.git
```
- Construir os projetos:
```
cd gateway
./mvnw clean package -DskipTests=true
cd ../canary-service
./mvnw clean package -DskipTests=true
cd ../stable-service
./mvnw clean package -DskipTests=true
cd ..
```
- Executar todos os projetos:
```
java -jar gateway/target/gateway-0.0.1-SNAPSHOT.jar
java -jar canary-service/target/canary-service-0.0.1-SNAPSHOT.jar
java -jar stable-service/target/stable-service-0.0.1-SNAPSHOT.jar
```