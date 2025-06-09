# API Test

> Projeto de exemplo para construção e execução de uma API usando Maven e Docker.

#### Pré-requisitos:
- Java 11
- Docker
- Maven Wrapper (./mvnw incluso no projeto)

#### Como rodar o projeto:

### 1. Compilar o projeto com Maven
```batch
./mvnw clean package
```

### 2. Construir a imagem Docker
```batch
docker build -t api-test .
```

### 3. Rodar o container
```batch
docker run -p 8080:8080 api-test
```

# 

### Serviço DockerImage
<img src="https://github.com/Dspofu/API-javaAula/blob/main/DockerDemoIMG.png">

### A aplicação vai funcionar em: [localhost:8080](http://localhost:8080)

> Deixei preparado um arquivo [test.js](https://github.com/Dspofu/API-javaAula/blob/main/test.js) com todas as requisições preparadas (`POST, GET, PUT, DELETE`)
