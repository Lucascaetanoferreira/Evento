package br.edu.unisep.model;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.List;

public class Evento {
    private int id;
    private String nome;
    private  String datainicio;
    private String datafinal;
    private String local;

    public Evento() {
    }

    public Evento(int id, String nome, String datainicio, String datafinal, String local) {
        this.id = id;
        this.nome = nome;
        this.datainicio = datainicio;
        this.datafinal = datafinal;
        this.local = local;
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

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}





