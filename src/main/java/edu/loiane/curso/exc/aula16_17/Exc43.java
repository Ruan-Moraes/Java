package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listaProdutos = {
                "Cachorro Quente",
                "Bauru Simples",
                "Bauru com Ovo",
                "Hamburguer",
                "Cheeseburguer",
                "Refrigerante"
        };
        double[] listaPrecos = {
                1.20,
                1.30,
                1.50,
                1.20,
                1.30,
                1.00
        };
        int[] listaCodigos = {
                100, 101, 102, 103, 104, 105
        };

        double valorTotal = 0;

        System.out.println("Lista de Produtos");

        for (int i = 0; i < listaProdutos.length; i++) {
            System.out.println(listaProdutos[i] + " - Código: " + listaCodigos[i] + " - Preço: R$ " + listaPrecos[i]);
        }

        while (true) {
            System.out.println("Digite o código do produto desejado: ");
            int codigoProduto = scanner.nextInt();

            System.out.println("Digite a quantidade do produto desejado: ");
            int quantidadeProduto = scanner.nextInt();

            int indexProduto = -1;

            for (int i = 0; i < listaCodigos.length; i++) {
                if (listaCodigos[i] == codigoProduto) {
                    indexProduto = i;

                    break;
                }
            }

            if (indexProduto == -1) {
                System.out.println("Produto não encontrado.");
            } else {
                double valorPedido = listaPrecos[indexProduto] * quantidadeProduto;

                valorTotal += valorPedido;

                System.out.println("Valor total: R$ " + valorPedido);
            }


            System.out.println("Deseja continuar? (S/N)");
            String continuar = scanner.next();

            if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("Valor total do pedido: R$ " + valorTotal);

                break;
            }
        }
    }
}
