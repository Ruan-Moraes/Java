package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n): ");
        int n = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            double termo = (double) i / (2 * i - 1);

            soma += termo;

            System.out.println(String.format("Termo %d: %.2f", i, termo));
        }

        System.out.println(String.format("Soma da série: %.2f", soma));
    }
}
