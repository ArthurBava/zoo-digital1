package br.edu.atitus;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Predador;

public class Leao extends Mamifero implements Corredor, Predador {

    public Leao(String nome, int idade) {
        super(nome, idade, "Savana");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo uma zebra");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela savana");
    }

    @Override
    public void caçar() {
        System.out.println(getNome() + " está caçando em grupo");
    }
}