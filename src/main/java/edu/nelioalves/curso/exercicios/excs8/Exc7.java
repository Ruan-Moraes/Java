package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        int countPares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                countPares++;
            }
        }

        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + countPares);

        scanner.close();
    }
}
