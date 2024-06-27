package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor " + i + ": ");

            vetorA[i - 1] = scanner.nextInt();
        }

        System.out.println("A média dos valores é: " + media(vetorA));
    }

    public static double media(int[] vetor) {
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        return soma / vetor.length;
    }
}
