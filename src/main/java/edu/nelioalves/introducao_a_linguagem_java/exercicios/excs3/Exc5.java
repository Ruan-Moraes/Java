package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o código do item:");
        int codigo = scanner.nextInt();

        System.out.println("Entre com a quantidade do item:");
        int quantidade = scanner.nextInt();

        double total = 0;

        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.5;
        } else if (codigo == 3) {
            total = quantidade * 5.0;
        } else if (codigo == 4) {
            total = quantidade * 2.0;
        } else if (codigo == 5) {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
