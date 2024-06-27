package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        int[] quantidadesParcelas = {1, 3, 6, 9, 12};
        double[] porcentagensJuros = {0, 0.10, 0.15, 0.20, 0.25};

        System.out.printf("%-15s %-15s %-20s %-15s%n", "Valor da Dívida", "Valor dos Juros", "Quantidade de Parcelas", "Valor da Parcela");

        for (int i = 0; i < quantidadesParcelas.length; i++) {
            int quantidadeParcelas = quantidadesParcelas[i];
            double porcentagemJuros = porcentagensJuros[i];
            double valorJuros = valorDivida * porcentagemJuros;
            double valorTotal = valorDivida + valorJuros;
            double valorParcela = valorTotal / quantidadeParcelas;

            System.out.printf("R$ %-13.2f R$ %-13.2f %-20d R$ %-13.2f%n", valorTotal, valorJuros, quantidadeParcelas, valorParcela);
        }
    }
}
