package br.edu.unisep;

import br.edu.unisep.model.Evento;
import br.edu.unisep.model.Palestrante;
import br.edu.unisep.model.Participante;
import br.edu.unisep.model.Sessao;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Evento local = new Evento();
        local.setId(1);
        local.setNome("STARTUP WEEKEND");
        local.setDatainicio("23/10/2024");
        local.setDatafinal("25/10/2024");
        local.setLocal("Unisep");


        Participante pessoa = new Participante();
        pessoa.setId(1);
        pessoa.setNome("lucas Caetano Ferreira");
        pessoa.setEmail("lucascaetanoferreira232930@gmail.com");
        pessoa.setIdade(21);

        Palestrante pessoa2 = new Palestrante();
        pessoa2.setId(1);
        pessoa2.setNome("joão da costa");
        pessoa2.setEspecialidade("tecnologia e inovação");

        Sessao local2= new Sessao();
        local2.setNome("catarina");
        local2.setHorario("20:00");

        JOptionPane.showMessageDialog(null, local);
        // ccccccc

    }
}
