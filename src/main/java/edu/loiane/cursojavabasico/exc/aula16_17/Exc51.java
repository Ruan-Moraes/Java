package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n): ");
        int n = scanner.nextInt();

        double soma = 0.0;

        for (int i = 1; i <= n; i++) {
            int m = 2 * i - 1;
            double termo = (double) i / m;

            soma += termo;

            System.out.println(String.format("Termo %d: %.5f", i, termo));
        }

        System.out.println(String.format("Soma da série: %.5f", soma));
    }
}
