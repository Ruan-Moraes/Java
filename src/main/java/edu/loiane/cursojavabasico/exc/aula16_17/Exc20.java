package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular o fatorial: ");

        while (true) {
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 16) {
                int fatorialDoNumero = 1;

                for (int i = numero; i > 0; i--) {
                    fatorialDoNumero *= i;
                }

                System.out.println("O fatorial de " + numero + " é " + fatorialDoNumero);

                break;
            } else {
                System.out.println("Digite um número entre 0 e 16:");
            }
        }


    }
}
