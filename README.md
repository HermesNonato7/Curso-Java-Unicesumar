# Curso-Java-Unicesumar
Repositório de códigos em Java da faculdade de ADS

**Projeto de estudo em Java Swing**

Este projeto Ã© um exemplo de aplicaÃ§Ã£o em Java Swing, feita na IDE NetBeans, com Java 17, JDBC e banco de dados MySQL.

**Objetivo**

O objetivo deste projeto Ã© demonstrar o uso de Swing para criar uma interface grÃ¡fica para um sistema simples de cadastro de usuÃ¡rios.

**Classes**

* **Conexao:** Classe responsÃ¡vel por estabelecer a conexÃ£o com o banco de dados.
* **CadastroUsuarioController:** Classe que controla a tela de cadastro de usuÃ¡rios.
* **LoginController:** Classe que controla a tela de login.
* **TelaCadastro:** Classe que representa a tela de cadastro de usuÃ¡rios.
* **TelaPrincipal:** Classe que representa a tela principal do sistema.

**Banco de dados**

O banco de dados utilizado Ã© um banco MySQL com a seguinte estrutura:

```sql
CREATE SCHEMA `mapa` ;

CREATE TABLE `mapa`.`usuario` (
Â `id` INT NOT NULL AUTO_INCREMENT,
Â `nome` VARCHAR(45) NULL,
Â `login` VARCHAR(45) NULL,
Â `senha` VARCHAR(45) NULL,
Â `email` VARCHAR(45) NULL,
Â PRIMARY KEY (`id`));
```

**Como executar**

Para executar o projeto, Ã© necessÃ¡rio ter o Java 17 instalado e o MySQL instalado e configurado.

1. Abra o projeto no NetBeans.
2. Crie um banco de dados MySQL com o nome "mapa".
3. Importe o script de criaÃ§Ã£o da tabela "usuario" para o banco de dados "mapa".
4. Execute o projeto.

**Como usar**

Para cadastrar um novo usuÃ¡rio, abra a tela de cadastro e preencha os campos de nome, login, senha e e-mail. Em seguida, clique no botÃ£o "Cadastrar".

Para fazer login, abra a tela de login e digite o login e a senha de um usuÃ¡rio cadastrado. Em seguida, clique no botÃ£o "Entrar".

**Desafios**

Alguns desafios que podem ser enfrentados ao desenvolver este projeto sÃ£o:

* Implementar a validaÃ§Ã£o dos dados de entrada do usuÃ¡rio.
* Implementar um sistema de seguranÃ§a para evitar acesso nÃ£o autorizado ao sistema.
* Implementar funcionalidades adicionais, como a ediÃ§Ã£o e exclusÃ£o de usuÃ¡rios.

**ConsideraÃ§Ãµes finais**

Este projeto Ã© um bom ponto de partida para o desenvolvimento de aplicaÃ§Ãµes em Java Swing. Ele demonstra o bÃ¡sico do uso de Swing para criar uma interface grÃ¡fica simples.
