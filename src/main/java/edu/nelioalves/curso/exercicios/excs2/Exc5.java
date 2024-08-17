package edu.nelioalves.curso.exercicios.excs2;

import java.util.Locale;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o código da peça 1:");
        int codigoPeca1 = scanner.nextInt();

        System.out.println("Entre com o número de peças 1:");
        int numeroPecas1 = scanner.nextInt();

        System.out.println("Entre com o valor unitário da peça 1:");
        double valorUnitarioPeca1 = scanner.nextDouble();

        System.out.println("Entre com o código da peça 2:");
        int codigoPeca2 = scanner.nextInt();

        System.out.println("Entre com o número de peças 2:");
        int numeroPecas2 = scanner.nextInt();

        System.out.println("Entre com o valor unitário da peça 2:");
        double valorUnitarioPeca2 = scanner.nextDouble();

        double total = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
