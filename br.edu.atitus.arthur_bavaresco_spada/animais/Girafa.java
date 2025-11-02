package br.edu.atitus;


import br.edu.atitus.interfaces.Corredor;

public class Girafa extends Mamifero implements Corredor {

    public Girafa(String nome, int idade) {
        super(nome, idade, "Savanas Africanas");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está fazendo sons suaves");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo folhas de Arvores");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela savana");
    }

}