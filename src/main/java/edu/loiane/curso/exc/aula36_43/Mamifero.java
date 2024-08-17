package edu.loiane.curso.exc.aula36_43;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, double comprimento, String cor, String ambiente, double velocidade, String alimento) {
        super(nome, comprimento, cor, ambiente, velocidade);

        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "alimento='" + alimento + '\'' +
                "} " + super.toString();
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
