package edu.nelioalves.curso.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor de [X,Y]:");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }
}
