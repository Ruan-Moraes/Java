package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs5;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int n = scanner.nextInt();

        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
