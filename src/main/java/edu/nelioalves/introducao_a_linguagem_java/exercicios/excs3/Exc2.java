package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
