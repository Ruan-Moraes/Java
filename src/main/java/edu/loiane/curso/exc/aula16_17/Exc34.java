package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean primo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;

                break;
            }
        }

        if (primo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}
