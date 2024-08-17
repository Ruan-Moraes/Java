package edu.nelioalves.curso.exercicios.excs8.exc2;

public class Funcionario {
    private final int id;
    private final String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * porcentagem / 100;
        }
    }
}
