
# API Cadastro de Produtos

API completa de cadastro de produtos em Spring Boot 3. 


## Funcionalidades

- Cadastrar
- Remover
- Atualizar
- Visualizar


## Stack utilizada

**Front-end:** React v18.2.0, Bootstrap v5.3.0

**Back-end:** Node v18.16.0, Spring Boot v3.1.0

**Banco de Dados:** MySql

**Dependências:** Spring Web, Lombok, MySQL Driver, Spring Boot DevTools, Spring Data JPA




## Documentação da API

#### Retorna todos os itens

```http
  GET /listar
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `string` | Id do produto |
| `modelo` | `string` | Modelo do produto |
| `marca` | `string` | Marca do produto |

```http
  POST /cadastrar
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `modelo` | `string` | **Obrigatório** |
| `marca` | `string` | **Obrigatório** |

#### Remover

```http
  DELETE /remover/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Alterar

```http
  PUT /alterar
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `modelo` | `string` | **Obrigatório**  |
| `marca` | `string` | **Obrigatório** |


## Referência

 - [Spring Boot e React - 2023. Canal: Ralf Lima](https://www.youtube.com/playlist?list=PLWXw8Gu52TRKouXUo3Abu33_ODPXZTz64)


