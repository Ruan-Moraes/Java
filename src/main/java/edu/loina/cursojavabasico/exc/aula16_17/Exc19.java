package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");

            while (true) {
                numeros[i] = scanner.nextInt();

                if (numeros[i] >= 0 && numeros[i] <= 1000) {
                    break;
                } else {
                    System.out.println("Digite um número entre 0 e 1000:");
                }
            }
        }
    }
}
