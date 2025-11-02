package br.edu.atitus;

import br.edu.atitus.interfaces.Voador;


public class TicoTico extends Ave implements Voador{

    public TicoTico(String nome, int idade) {
        super(nome, idade, "Campos e áreas urbanas");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo seu canto característico");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes e pequenos insetos");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando entre arbustos e árvores");
    }

    @Override
    public void cantar() {
        System.out.println(getNome() + " está cantando para atrair parceiros");
    }
}