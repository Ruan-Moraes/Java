package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é o maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é o maior");
        } else {
            System.out.println("O terceiro número é o maior");
        }
    }
}
