package br.unicesumar.core.emtity;


public class Usuario {
    private int id;         // ID do usuário
    private String nome;    // Nome do usuário
    private String login;   // Nome de usuário (login)
    private String senha;   // Senha do usuário
    private String email;   // Endereço de e-mail do usuário
    
    // Construtor para criar um objeto User com ID
    public Usuario(int id, String nome, String login, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
/*
    // Construtor para criar um objeto User sem ID (geralmente usado ao cadastrar um novo usuário)
    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }*/

    // Métodos getters e setters para acessar e modificar os campos privados da classe
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}