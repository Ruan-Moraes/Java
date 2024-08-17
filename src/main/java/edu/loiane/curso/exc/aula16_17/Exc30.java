package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do pão: R$ ");
        double precoPorPao = scanner.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double total = quantidade * precoPorPao;
            System.out.printf("%d - R$ %.2f%n", quantidade, total);
        }
    }
}
