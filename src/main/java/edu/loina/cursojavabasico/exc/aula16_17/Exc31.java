package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> valoresProdutos = new ArrayList<>();

        System.out.println("Lojas Tabajara");

        while (true) {
            System.out.print("Digite o preço do produto: ");

            double valorProduto = scanner.nextDouble();

            if (valorProduto == 0) {
                break;
            }

            valoresProdutos.add(valorProduto);
        }

        double precoTotal = valoresProdutos.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Total: R$ " + precoTotal);

        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        System.out.println("Troco: R$ " + (valorPago - precoTotal));
    }
}
