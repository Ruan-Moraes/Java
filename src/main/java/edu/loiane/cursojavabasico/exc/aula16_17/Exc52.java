package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (N): ");
        int N = scanner.nextInt();

        double H = 0.0;

        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;
        }

        System.out.println(String.format("O valor de H com %d termos é: %.5f", N, H));
    }
}
