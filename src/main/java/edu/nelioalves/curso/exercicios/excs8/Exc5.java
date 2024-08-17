package edu.nelioalves.curso.exercicios.excs8;

import java.util.Arrays;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantos números você vai digitar? ");
        int N = scanner.nextInt();


        double[] numeros = new double[N];


        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");

            numeros[i] = scanner.nextDouble();
        }


        System.out.println("VALORES:");
        double soma = 0;

        for (double num : numeros) {
            System.out.println(num);
            soma += num;
        }

        double media = soma / N;

        System.out.println("VALORES:" + Arrays.toString(numeros));
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        scanner.close();
    }
}
