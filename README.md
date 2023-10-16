# Api-Atacado-Presentes

## Descrição do Projeto


## ⚒️Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.4
- Spring Data JPA
- JavaMailSender
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

### Categorias
- `POST /categorias:` Permite cadastrar uma nova categoria.
- `GET /categorias:` Retorna uma lista paginada de todas as categorias cadastradas.
- `GET /categorias/{id}:` Retorna uma categoria específica com base no ID fornecido na URL.
- `PUT /categorias/{id}:` Permite atualizar as informações de uma categoria com base no ID fornecido na URL.
- `DELETE /categorias/{id}:` Permite excluir uma categoria com base no ID fornecido na URL. 

### Produtos
- `POST /produtos:` Permite cadastrar um novo produto. 
- `GET /produtos:` Retorna uma lista paginada de todos os produtos cadastrados. 
- `GET /produtos/{id}:` Retorna um produto específico com base no ID fornecido na URL.
- `PUT /produtos/{id}:` Permite atualizar as informações de um produto com base no ID fornecido na URL. 
- `DELETE /produtos/{id}:` Permite excluir um produto com base no ID fornecido na URL.

### Pedidos
- `POST /pedidos:` Permite cadastrar um novo pedido.
- `GET /pedidos:` Retorna uma lista paginada de todos os pedidos cadastrados. 
- `GET /pedidos/{id}:` Retorna um pedido específico com base no ID fornecido na URL. 
- `PUT /pedidos/{id}:` Permite atualizar as informações de um pedido com base no ID fornecido na URL. 
- `Delete /pedidos/{id}:` Permite excluir um pedido com base no ID fornecido na URL.

### Itens do Pedido 
- `POST /itens-pedido:` Permite cadastrar um novo item de pedido.
- `GET /itens-pedido:` Retorna uma lista de todos os itens de pedido cadastrados.
- `GET /itens-pedido/{id}:` Retorna um item de pedido específico com base no ID fornecido na URL.
- `PUT /itens-pedido/{id}:` Permite atualizar as informações de um item de pedido com base no ID fornecido na URL.
- `DELETE /itens-pedido/{id}:` Permite excluir um item de pedido com base no ID fornecido na URL. 

### Avaliação dos produtos 
- `POST /avaliacoes-produto:` Permite cadastrar uma nova avaliação de produto.
- `GET /avaliacoes-produto:` Retorna uma lista paginada de todas as avaliações de produto cadastradas. 
- `GET /avaliacoes-produto/produto/{id}:` Retorna uma lista de avaliações de um produto específico com base no ID do produto fornecido na URL. 
- `GET /avaliacoes-produto/{id}:` Retorna uma avaliação de produto específica com base no ID fornecido na URL.
- `PUT /avaliacoes-produto/{id}:` Permite atualizar as informações de uma avaliação de produto com base no ID fornecido na URL.
- `DELETE /avaliacoes-produto/{id}:` Permite excluir uma avaliação de produto com base no ID fornecido na URL.

### Envio de E-mail 
- Serviço para enviar notificações por e-mail aos clientes quando o status de seus pedidos é atualizado. Ele utiliza o JavaMailSender para enviar e-mails e é acionado quando uma mudança de status no pedido é detectada.

## Contribuição

Contribuições são bem-vindas! Se você identificar problemas ou melhorias, sinta-se à vontade para abrir um pull request.

## Licença 

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)





