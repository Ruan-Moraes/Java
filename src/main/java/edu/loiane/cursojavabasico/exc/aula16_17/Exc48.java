package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        String numeroStr = Integer.toString(numero);
        String numeroInvertidoStr = new StringBuilder(numeroStr).reverse().toString();

        int numeroInvertido = Integer.parseInt(numeroInvertidoStr);

        System.out.println("Número invertido: " + numeroInvertido);
    }
}
