package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);

                break;
            }

            if (i == num - 1) {
                System.out.println("É primo");
            }
        }
    }
}