package edu.nelioalves.curso.exercicios.excs2;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o raio de um círculo:");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("A = %.4f\n", area);
    }
}
