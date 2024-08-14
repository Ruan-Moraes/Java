package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs5;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int n = scanner.nextInt();

        int numerosEntre10e20 = 0;
        int numerosForaDe10e20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com um número: ");
            int n2 = scanner.nextInt();

            if (n2 >= 10 && n2 <= 20) {
                numerosEntre10e20++;
            } else {
                numerosForaDe10e20++;
            }
        }

        System.out.println(numerosEntre10e20 + " in");
        System.out.println(numerosForaDe10e20 + " out");
    }
}
