FROM openjdk:11-jre-slim    
 
# Use a imagem base do OpenJDK 11
 
WORKDIR /app
 
# Define o diretório de trabalho dentro do container
 
COPY target/api-test-0.0.1.jar app.jar
 
# Copia o arquivo JAR da aplicação para o diretório de trabalho
 
EXPOSE 8080     
 
# Expõe a porta 8080 para acesso externo
 
CMD ["java", "-jar", "app.jar"]