package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        boolean ePrimo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo - divisível por " + i);

                ePrimo = false;
            }
        }

        if (ePrimo) {
            System.out.println("É primo");
        }
    }
}
