package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;


public class Lambari extends Peixe implements Nadador {

    public Lambari(String nome, int idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está borbulhando suavemente");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos insetos e algas");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando em cardume no riacho");
    }

    @Override
    public void fugir() {
        System.out.println(getNome() + " está fugindo de predadores rapidamente");
    }
}