package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tiposDeCarne = {"File Duplo", "Alcatra", "Picanha"};
        double[] precoAte5kg = {4.90, 5.90, 6.90};
        double[] precoAcima5kg = {5.80, 6.80, 7.80};

        System.out.println("Escolha o tipo de carne:");
        for (int i = 0; i < tiposDeCarne.length; i++) {
            System.out.println((i + 1) + " - " + tiposDeCarne[i]);
        }
        int tipoCarneIndex = scanner.nextInt() - 1;

        System.out.print("Digite a quantidade de carne (em Kg): ");
        double quantidadeCarne = scanner.nextDouble();

        System.out.print("A compra será feita no cartão Tabajara? (s/n): ");
        char pagamentoComCartao = scanner.next().toLowerCase().charAt(0);

        double precoPorKg;

        if (quantidadeCarne <= 5) {
            precoPorKg = precoAte5kg[tipoCarneIndex];
        } else {
            precoPorKg = precoAcima5kg[tipoCarneIndex];
        }

        double precoTotal = quantidadeCarne * precoPorKg;

        double desconto = 0.0;

        if (pagamentoComCartao == 's') {
            desconto = precoTotal * 0.05;
        }

        double valorAPagar = precoTotal - desconto;

        System.out.println("--- Cupom Fiscal ---");
        System.out.println("Tipo de carne: " + tiposDeCarne[tipoCarneIndex]);
        System.out.println("Quantidade de carne: " + quantidadeCarne + " Kg");
        System.out.println("Preço total: R$ " + precoTotal);

        if (pagamentoComCartao == 's') {
            System.out.println("Tipo de pagamento: Cartão Tabajara");
            System.out.println("Valor do desconto: R$ " + desconto);
        } else {
            System.out.println("Tipo de pagamento: Dinheiro");
        }

        System.out.println("Valor a pagar: R$ " + valorAPagar);
        System.out.println("----------------------");
    }
}
