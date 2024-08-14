package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs5;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }
    }
}
