r
# Projeto Web Services com Spring Boot e JPA/Hibernate

Este é um projeto Spring Boot Java que visa demonstrar a criação de serviços web utilizando Spring Boot e JPA/Hibernate para acesso ao banco de dados. O projeto aborda diversos objetivos, incluindo a estruturação das camadas lógicas, configuração do banco de dados de teste (H2), povoamento do banco de dados, implementação de operações CRUD (Create, Retrieve, Update, Delete) e tratamento de exceções.

## Objetivos do Projeto

- Criar um projeto Spring Boot Java.
- Implementar o modelo de domínio da aplicação.
- Estruturar as camadas lógicas: resource (controladores), service (serviços) e repository (repositórios).
- Configurar um banco de dados de teste (H2) para desenvolvimento.
- Povoar o banco de dados com dados iniciais para testes.
- Implementar operações CRUD para manipulação dos dados.
- Realizar tratamento de exceções para garantir a robustez da aplicação.

## Estrutura do Projeto

- **Model**: Contém as entidades do domínio da aplicação.
- **Repository**: Camada responsável por acessar e manipular os dados no banco de dados.
- **Service**: Camada responsável por implementar a lógica de negócio da aplicação.
- **Resource**: Controladores para definir os endpoints da API.
- **Exception**: Tratamento de exceções personalizado.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (para ambiente de teste)
- Maven/Gradle (gerenciamento de dependências)
- Git (controle de versão)
