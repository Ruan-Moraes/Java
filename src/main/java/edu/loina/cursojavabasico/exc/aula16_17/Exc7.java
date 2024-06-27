package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;


public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o valor " + i + ": ");

            vetorA[i - 1] = scanner.nextInt();
        }

        System.out.println("O maior valor é: " + maiorValor(vetorA));
    }

    public static int maiorValor(int[] vetor) {
        int maior = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        return maior;
    }
}
