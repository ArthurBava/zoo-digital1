package br.edu.atitus;

import br.edu.atitus.interfaces.Predador;

public class Cobra extends Reptil implements Predador {

    public Cobra(String nome, int idade, String tipoEscamas) {
        super(nome, idade, tipoEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está sibilando");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está engolindo um rato");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando silenciosamente entre as folhas");
    }
}