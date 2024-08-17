package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");

            numeros[i] = scanner.nextDouble();
        }

        double maiorValor = numeros[0];
        int posicaoMaior = 0;

        for (int i = 1; i < n; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];

                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        scanner.close();
    }
}
