package br.edu.atitus;

public abstract class Reptil extends Animal {

    private String tipoEscamas;

    public Reptil(String nome, int idade, String tipoEscamas) {
        super(nome, "Reptil", idade);
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public void botar() {
        System.out.println(this.getNome() + " está botando.");
    }

    public void rastejar() {
        System.out.println(this.getNome() + " está rastejando.");
    }
}