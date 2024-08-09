package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o salário:");
        double salario = scanner.nextDouble();

        double imposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto > 0) {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
