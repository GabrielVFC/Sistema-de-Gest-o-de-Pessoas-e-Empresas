# Sistema de Gestão de Pessoas e Empresas

Este projeto é uma aplicação em Java com Spring Boot que implementa um sistema de gerenciamento de pessoas físicas, jurídicas e empresas. Ele utiliza as tecnologias mais recentes do Spring Framework e segue o padrão arquitetural MVC.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.0**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (banco de dados em memória)
- **Lombok**
- **Spring DevTools**

## Pré-requisitos

Certifique-se de que você possui os seguintes itens instalados:

1. **Java 17 ou superior**
2. **Maven 3.8 ou superior**
3. **Git** (opcional, para clonar o repositório)

## Instalação

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/sistema-gestao.git
cd sistema-gestao
```
2. Compile o projeto com Maven
```bash
mvn clean install
```
3. Execute a aplicação
```bash
mvn spring-boot:run
```
A aplicação estará disponível em: http://localhost:8080

## Configuração do Banco de Dados
Este projeto utiliza o H2 Database, configurado no modo em memória. O console do H2 pode ser acessado em:

URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (deixe em branco)
Alterar configurações do banco de dados
Se desejar utilizar outro banco de dados (ex.: MySQL), atualize o arquivo src/main/resources/application.properties com suas credenciais:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```
Endpoints da API
1. Lista de Endpoints Disponíveis
```
Método	Endpoint	Descrição
GET	/api/pessoas	Lista todas as pessoas
POST	/api/pessoas	Cria uma nova pessoa
GET	/api/pessoas/{id}	Detalha uma pessoa pelo ID
PUT	/api/pessoas/{id}	Atualiza os dados de uma pessoa
DELETE	/api/pessoas/{id}	Exclui uma pessoa pelo ID
```
3. Exemplo de Requisição com curl
Criar uma nova pessoa
```bash
curl -X POST http://localhost:8080/api/pessoas \
-H "Content-Type: application/json" \
-d '{"nome":"João Silva", "endereco":"Rua A, 123", "email":"joao@email.com", "senha":"123456"}'
```
Obter todas as pessoas
```bash
curl -X GET http://localhost:8080/api/pessoas
```
Atualizar uma pessoa
```bash
curl -X PUT http://localhost:8080/api/pessoas/1 \
-H "Content-Type: application/json" \
-d '{"nome":"João Santos", "endereco":"Rua B, 456", "email":"joao.santos@email.com", "senha":"novaSenha"}'
```
Deletar uma pessoa
```bash
curl -X DELETE http://localhost:8080/api/pessoas/1
```
