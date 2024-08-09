package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs2;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Entre com outro número inteiro:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Soma = " + sum);
    }
}
