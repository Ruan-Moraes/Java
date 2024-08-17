package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior.");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O primeiro número é o menor.");
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior.");
        }

        if (num2 < num1 && num2 < num3) {
            System.out.println("O segundo número é o menor.");
        }

        if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro número é o maior.");
        }

        if (num3 < num1 && num3 < num2) {
            System.out.println("O terceiro número é o menor.");
        }
    }
}
