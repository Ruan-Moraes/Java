package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int fatorialDoNumero = 1;

        for (int i = numero; i > 0; i--) {
            fatorialDoNumero *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorialDoNumero);
    }
}
