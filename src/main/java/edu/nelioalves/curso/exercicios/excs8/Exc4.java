package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int N = scanner.nextInt();

        if (N <= 0 || N > 10) {
            System.out.println("Número inválido. O valor deve ser entre 1 e 10.");

            scanner.close();

            return;
        }

        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");

            numeros[i] = scanner.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int num : numeros) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}