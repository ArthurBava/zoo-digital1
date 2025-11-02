package br.edu.atitus;

import br.edu.atitus.interfaces.Predador;

public class Lagarto extends Reptil implements Predador {

    public Lagarto(String nome, int idade, String tipoEscamas) {
        super(nome, idade, tipoEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo sons baixos");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo insetos");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando pequenos animais");
    }
}