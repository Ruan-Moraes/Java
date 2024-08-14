package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs5;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.println("Entre com o segundo número: ");
            double n2 = scanner.nextDouble();

            if (n2 == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(n1 / n2);
            }
        }
    }
}
