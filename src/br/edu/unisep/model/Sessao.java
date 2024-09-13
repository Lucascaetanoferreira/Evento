package br.edu.unisep.model;

import javax.xml.crypto.Data;
import java.util.List;

public class Sessao {
    private String nome;
    private String horario;


    public Sessao() {
    }

    public Sessao(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}




