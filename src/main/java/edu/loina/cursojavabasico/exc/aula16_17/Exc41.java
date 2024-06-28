package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da dívida: ");
        double valorDivida = scanner.nextDouble();

        int[][] tabelaJurosParcelas = {
                {1, 0},
                {3, 10},
                {6, 15},
                {9, 20},
                {12, 25}
        };

        System.out.println("Valor da dívida: " + valorDivida);

        for (int[] jurosParcela : tabelaJurosParcelas) {
            double valorParcela = valorDivida / jurosParcela[0];
            double valorJuros = valorParcela * (jurosParcela[1] / 100.0);
            double valorTotal = valorParcela + valorJuros;

            System.out.println(jurosParcela[0] + "x de R$ " + valorTotal + " - Total: R$ " + (valorTotal * jurosParcela[0]));
        }
    }
}
