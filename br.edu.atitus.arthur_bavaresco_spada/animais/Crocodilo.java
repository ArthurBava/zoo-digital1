package br.edu.atitus;

import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Predador;

public class Crocodilo extends Reptil implements Nadador, Predador {

    public Crocodilo(String nome, int idade, String tipoEscamas) {
        super(nome, idade, tipoEscamas);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo baixo");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está devorando um peixe");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando lentamente na água");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando silenciosamente na margem do rio");
    }
}