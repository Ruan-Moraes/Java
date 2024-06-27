package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar?");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Entre com a nota " + (i + 1) + ": ");

            notas[i] = scanner.nextDouble();
        }

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / qtdNotas;

        System.out.println("A média das notas é: " + media);
    }
}
