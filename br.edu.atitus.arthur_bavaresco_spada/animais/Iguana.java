package br.edu.atitus;


import br.edu.atitus.interfaces.Nadador;

public class Iguana extends Reptil implements Presas, Nadador {

    public Iguana(String nome, int idade, String tipoEscamas) {
        super(nome, idade, tipoEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo sons guturais");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas e frutas");
    }


    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando para escapar de predadores");
    }
}