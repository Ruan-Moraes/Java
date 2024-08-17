package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];
        int somaPares = 0;
        int countPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];

                countPares++;
            }
        }

        if (countPares > 0) {
            double mediaPares = (double) somaPares / countPares;

            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        scanner.close();
    }
}
