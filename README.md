# 🎬 ScreenMatch API

API REST desenvolvida em **Java com Spring Boot** que gera, de forma aleatória, frases populares de personagens de filmes e séries.

O objetivo do projeto é aplicar conceitos de desenvolvimento back-end utilizando boas práticas de arquitetura, persistência de dados com JPA e integração com banco de dados PostgreSQL.

---

## 🚀 Tecnologias Utilizadas

- Java 21+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- pgAdmin (para gerenciamento e inserção manual de dados)

---

## 📌 Funcionalidades

- ✅ Geração aleatória de frases de filmes e séries
- ✅ Integração com banco de dados PostgreSQL
- ✅ Persistência de dados com JPA/Hibernate
- ✅ Estrutura organizada em camadas (Controller, Service, Repository)
- ✅ API REST seguindo boas práticas

---

## 📂 Estrutura Base

- **Controller** → Responsável por expor os endpoints REST.
- **Service** → Contém as regras de negócio.
- **Repository** → Comunicação com o banco via JPA.
- **Model/Entity** → Representação das tabelas no banco.
- **DTO** → Transferência de dados na API.

---

## 🗄️ Banco de Dados

- Banco utilizado: **PostgreSQL**
- Os dados foram populados manualmente via **pgAdmin**
- A aplicação se conecta ao banco utilizando configurações definidas no `application.properties`

Exemplo de configuração:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/screenmatch
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## 📝 Exemplo de População do Banco de Dados

Abaixo estão exemplos de inserção manual de dados via pgAdmin:

```properties
insert into titulo(id, frase, personagem, nome, poster) values (1, 'Amigos não mentem', 'Eleven', 'Stranger things', 'https://m.media-amazon.com/images/M/MV5BMDZkYmVhNjMtNWU4MC00MDQxLWE3MjYtZGMzZWI1ZjhlOWJmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (2, 'Bem-vinda ao mundo real. É uma droga. Você vai amar', 'Monica', 'Friends', 'https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (3, 'Não é uma mentira se você acreditar nela', 'George Contanza', 'Seinfeld', 'https://m.media-amazon.com/images/M/MV5BZjZjMzQ2ZmUtZWEyZC00NWJiLWFjM2UtMzhmYzZmZDcxMzllXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (4, 'Somos apenas pessoas. Nós erramos, perdemos o rumo. Até os melhores têm os seus dias ruins. Mesmo assim seguimos em frente', 'Meredith Grey', 'Grey''s Anatomy', 'https://m.media-amazon.com/images/M/MV5BODA2Mjk0N2MtNGY0Mi00ZWFjLTkxODEtZDFjNDg4ZDliMGVmXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (5, 'Eu não estou em perigo, eu sou o perigo', 'Walter White', 'Breaking Bad', 'https://m.media-amazon.com/images/M/MV5BMzU5ZGYzNmQtMTdhYy00OGRiLTg0NmQtYjVjNzliZTg1ZGE4XkEyXkFqcGc@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (6, 'Não importa o que você faça na vida. Não vai ser lendário, a menos que os seus amigos estejam lá para ver', 'Barney', 'How I met your Mother', 'https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (7, 'Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.', 'Rocky Balboa', 'Rocky', 'https://m.media-amazon.com/images/M/MV5BZDEyY2M2MGMtYjg5OC00ZWFjLWFkZDQtNmQzZTdiYmYzZTBkXkEyXkFqcGc@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (8, 'Que a força esteja com você!', 'Obi Wan Kenobi', 'Star Wars', 'https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (9, 'Você me salvou de todas as maneiras que alguém pode ser salvo.', 'Rose Dawson', 'Titanic', 'https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg');
insert into titulo(id, frase, personagem, nome, poster) values (10, 'Você me deu uma eternidade dentro dos nossos dias numerados, e sou muito grata por isso.', 'Hazel', 'A culpa é das estrelas', 'https://m.media-amazon.com/images/M/MV5BNTVkMTFiZWItOTFkOC00YTc3LWFhYzQtZTg3NzAxZjJlNTAyXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg');
```

--- 

## ▶️ Como Executar o Projeto

1️⃣ Clonar o repositório
```
git clone https://github.com/Arthurtrin/Screenmatch-API.git
```

2️⃣ Acessar a pasta do projeto
```
cd Screenmatch-API
```

3️⃣ Configurar o banco de dados

- Criar o banco no PostgreSQL
- Ajustar as credenciais no application.properties

4️⃣ Executar a aplicação

Via Maven Wrapper:
```
./mvnw spring-boot:run
```

Ou no Windows:

```
mvnw.cmd spring-boot:run
```

A aplicação iniciará normalmente na porta:

```
http://localhost:8080
```

---

## 📡 Exemplo de Endpoint

🔹 Buscar frase aleatória

```
GET http://localhost:8080/series/frases
```

---

## 📥 Exemplo de resposta JSON

```
{
    "titulo": "Star Wars",
    "frase": "Que a força esteja com você!",
    "personagem": "Obi Wan Kenobi",
    "poster": "https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg"
}
```

---

## 🎯 Objetivo do Projeto

- Consolidar conhecimentos em Spring Boot
- Aplicar conceitos de JPA e persistência de dados
- Estruturar uma API REST profissional
- Praticar integração com banco PostgreSQL
- Simular um projeto real para portfólio

---

## 📚 Aprendizados Aplicados

- Criação de APIs REST com Spring Web
- Mapeamento de entidades com JPA
- Consultas ao banco de dados
- Organização em camadas
- Boas práticas de versionamento com Git
