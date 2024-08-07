package edu.loiane.cursojavabasico.exc.aula36;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[4];

    private void adicicionarNotas() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as notas do aluno " + nome + ":");

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");

            notas[i] = scan.nextDouble();
        }

        System.out.println();
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;

        adicicionarNotas();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
