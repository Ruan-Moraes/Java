package edu.nelioalves.curso.exercicios.excs2;

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

        System.out.println("Entre com um número inteiro [C]:");
        int c = scanner.nextInt();

        System.out.println("Entre com um número inteiro [D]:");
        int d = scanner.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
