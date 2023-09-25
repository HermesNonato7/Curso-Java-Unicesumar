# Curso-Java-Unicesumar
Repositório de códigos em Java da faculdade de ADS

**Projeto de estudo em Java Swing**

Este projeto é um exemplo de aplicação em Java Swing, feita na IDE NetBeans, com Java 17, JDBC e banco de dados MySQL.

**Objetivo**

O objetivo deste projeto é demonstrar o uso de Swing para criar uma interface gráfica para um sistema simples de cadastro de usuários.

**Classes**

* **ConexaoJDBC:** Classe responsável por estabelecer a conexão com o banco de dados.
* **UsuarioDAO:** Classe que controla a tela de cadastro de usuários.
* **UsuarioDAO:** Classe que controla a tela de login.
* **TelaCadastro:** Classe que representa a tela de cadastro de usuários.
* **TelaLogin2:** Classe que representa a tela principal do sistema.

**Banco de dados**

O banco de dados utilizado é um banco MySQL com a seguinte estrutura:

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

Para executar o projeto, é necessário ter o Java 17 instalado e o MySQL instalado e configurado.

1. Abra o projeto no NetBeans.
2. Crie um banco de dados MySQL com o nome "mapa".
3. Importe o script de criação da tabela "usuario" para o banco de dados "mapa".
4. Execute o projeto.

**Como usar**

Para cadastrar um novo usuário, abra a tela de cadastro e preencha os campos de nome, login, senha e e-mail. Em seguida, clique no botão "Cadastrar".

Para fazer login, abra a tela de login e digite o login e a senha de um usuário cadastrado. Em seguida, clique no botão "Entrar".

**Desafios**

Alguns desafios que podem ser enfrentados ao desenvolver este projeto sÃ£o:

* Implementar a validação dos dados de entrada do usuário.
* Implementar um sistema de segurança para evitar acesso não autorizado ao sistema.
* Implementar funcionalidades adicionais, como a edição e exclusão de usuários.

**Considerações finais**

Este projeto é um bom ponto de partida para o desenvolvimento de aplicações em Java Swing. Ele demonstra o básico do uso de Swing para criar uma interface gráfica simples.
Tenho um projeto em que já está implementado as funcionalidades de CRUD, porém é um projeto web em Java.
Ssim que tiver tempo, utilizarei os conceitos aprendidos no outro projeto neste e completarei os desafios acima.
Muito obrigado!
