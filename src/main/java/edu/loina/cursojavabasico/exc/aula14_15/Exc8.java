package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();

        System.out.println("O preço do segundo produto: ");
        double preco2 = scanner.nextDouble();

        System.out.println("O preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O primeiro produto é o mais barato.");
        }

        if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O segundo produto é o mais barato.");
        }

        if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O terceiro produto é o mais barato.");
        }
    }
}
