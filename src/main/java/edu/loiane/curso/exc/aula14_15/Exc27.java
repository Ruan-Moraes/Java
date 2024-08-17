package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidadeMorangos = scanner.nextDouble();

        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double quantidadeMacas = scanner.nextDouble();

        double precoMorangos;

        if (quantidadeMorangos <= 5) {
            precoMorangos = quantidadeMorangos * 2.50;
        } else {
            precoMorangos = quantidadeMorangos * 2.20;
        }

        double precoMacas;

        if (quantidadeMacas <= 5) {
            precoMacas = quantidadeMacas * 1.80;
        } else {
            precoMacas = quantidadeMacas * 1.50;
        }

        double valorTotal = precoMorangos + precoMacas;
        double quantidadeTotal = quantidadeMorangos + quantidadeMacas;

        if (quantidadeTotal > 8 || valorTotal > 25.00) {
            valorTotal *= 0.90;
        }

        System.out.printf("O valor a ser pago pelo cliente é R$ " + valorTotal);
    }
}
