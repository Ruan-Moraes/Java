package edu.loiane.curso.exc.aula16_17;

public class Exc29 {
    public static void main(String[] args) {
        double precoPorItem = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int quantidade = 1; quantidade <= 50; quantidade++) {
            double total = quantidade * precoPorItem;
            System.out.printf("%d - R$ %.2f%n", quantidade, total);
        }
    }
}
