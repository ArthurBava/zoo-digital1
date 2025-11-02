package br.edu.atitus;

import br.edu.atitus.interfaces.Voador;


public class Papagaio extends Ave implements Voador {

    public Papagaio(String nome, int idade) {
        super(nome, idade, "Floresta");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo sons agudos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes e frutas");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando entre as árvores");
    }

}