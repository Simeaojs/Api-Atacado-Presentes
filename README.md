# Api-Atacado-Presentes

## Descrição do Projeto


## ⚒️Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.4
- Spring Data JPA
- Banco de Dados (MySQL)
- Gerenciador de Dependências Maven
- Postman Para Requisições
- IDE Visual Studio Code


## 🪛Configuração do Ambiente
Para configurar o ambiente de desenvolvimento e iniciar a API em sua máquina local, siga as etapas abaixo:

1. Clone o repositório para o seu ambiente local.
   -  git clone ```https://github.com/Simeaojs/Api-Atacado-Presentes```
2. Configure as dependências do projeto (Maven).
3. Configure as informações do banco de dados no arquivo de configuração (`application.properties` ou `application.yml`).
4. Execute a aplicação.
#

## 📋Funcionalidades

### Usuários
- `POST /usuarios:` Permite cadastrar um novo usuário.
- `GET /usuarios:` Retorna uma lista paginada de todos os usuários cadastrados.
- `GET /usuarios/{id}:` Retorna um usuário específico com base no ID fornecido na URL.
- `PUT /usuarios/{id}:` Permite atualizar as informações de um usuário com base no ID fornecido na URL.
- `DELETE /usuarios/{id}:` Permite excluir um usuário com base no ID fornecido na URL.

### Clientes
- `POST /clientes:` Permite cadastrar um novo cliente.
- `GET /clientes:` Retorna uma lista paginada de todos os clientes cadastrados. 
- `GET /clientes/{id}:` Retorna um cliente específico com base no ID fornecido na URL.
- `PUT /clientes/{id}:` Permite atualizar as informações de um cliente com base no ID fornecido na URL.
- `DELETE /clientes/{id}:` Permite excluir um cliente com base no ID fornecido na URL.

### Fornecedores
- `POST /fornecedores:` Permite cadastrar um novo fornecedor.
- `GET /fornecedores:` Retorna uma lista paginada de todos os fornecedores cadastrados.
- `GET /fornecedores/{id}:` Retorna um fornecedor específico com base no ID fornecido na URL.
- `PUT /fornecedores/{id}:` Permite atualizar as informações de um fornecedor com base no ID fornecido na URL.
- `DELETE /fornecedores/{id}:` Permite excluir um fornecedor com base no ID fornecido na URL.


  



