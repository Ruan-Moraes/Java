package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de [a]: ");
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau.");

            return;
        }

        System.out.println("Digite o valor de [b]: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de [c]: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double deltaMore = (-b + Math.sqrt(delta)) / (2 * a);
        double deltaLess = (-b - Math.sqrt(delta)) / (2 * a);

        if (deltaMore < 0 || deltaLess < 0) {
            System.out.println("Não existe raiz real.");
        } else if (deltaMore == 0 || deltaLess == 0) {
            System.out.println("Existe uma raiz real.");
        } else {
            System.out.println("Existem duas raizes reais.");
        }
    }
}
