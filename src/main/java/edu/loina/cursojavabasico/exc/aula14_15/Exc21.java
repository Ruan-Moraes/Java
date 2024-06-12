package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do saque (de 10 reais até 600 reais):");
        int saque = scanner.nextInt();

        if (saque < 10) {
            System.out.println("Valor do saque menor que 10 reais");

            return;
        }

        if (saque > 600) {
            System.out.println("Valor do saque maior que 600 reais");

            return;
        }

        int notas100 = saque / 100;

        saque = saque % 100;

        int notas50 = saque / 50;

        saque = saque % 50;

        int notas10 = saque / 10;

        saque = saque % 10;

        int notas5 = saque / 5;

        saque = saque % 5;

        int notas1 = saque;

        System.out.println("Você receberá: ");
        System.out.println(notas100 + " notas de 100 reais");
        System.out.println(notas50 + " notas de 50 reais");
        System.out.println(notas10 + " notas de 10 reais");
        System.out.println(notas5 + " notas de 5 reais");
        System.out.println(notas1 + " notas de 1 real");
    }
}
