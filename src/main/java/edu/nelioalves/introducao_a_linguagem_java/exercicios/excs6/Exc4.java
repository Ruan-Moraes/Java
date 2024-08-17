package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs6;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o preço do dólar?");
        double dollarPrice = scanner.nextDouble();

        System.out.println("Quantos dólares você vai comprar?");
        double dollarAmount = scanner.nextDouble();

        System.out.printf("Valor a ser pago em reais = R$ %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, dollarAmount));
    }
}
