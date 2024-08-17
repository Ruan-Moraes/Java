package edu.loiane.curso.exc.aula36_43;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade, String caracteristicas) {
        super(nome, comprimento, cor, ambiente, velocidade);
        super.setNumeroPatas(0);

        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "caracteristicas='" + caracteristicas + '\'' +
                "} " + super.toString();
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
