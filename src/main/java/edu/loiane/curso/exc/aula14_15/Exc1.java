package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2);
        } else {
            System.out.println("O número " + num2 + " é maior que o número " + num1);
        }
    }
}
