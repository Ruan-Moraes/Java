package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número inteiro [A]:");
        int a = scanner.nextInt();

        System.out.println("Entre com um número inteiro [B]:");
        int b = scanner.nextInt();

        boolean ehMultiplo = a % b == 0 || b % a == 0;

        if (ehMultiplo) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }
    }
}
