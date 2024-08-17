package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();

            scanner.nextLine();
        }

        int indiceMaisVelho = 0;

        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nomes[indiceMaisVelho]);

        scanner.close();
    }
}
