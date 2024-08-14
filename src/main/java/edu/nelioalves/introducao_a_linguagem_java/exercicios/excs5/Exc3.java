package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs5;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", media);
        }
    }
}
