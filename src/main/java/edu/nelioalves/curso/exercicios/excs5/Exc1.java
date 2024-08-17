package edu.nelioalves.curso.exercicios.excs5;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número [1] - [1000]: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
