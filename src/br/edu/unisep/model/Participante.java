package br.edu.unisep.model;


import java.util.List;

public class Participante {
    private int id;
    private String nome;
    private String Email;
    private  int idade;

    public Participante() {
    }

    public Participante(int id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        Email = email;
        this.idade = idade;
    }

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
