package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs2;

import java.util.Locale;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor de A:");
        double a = scanner.nextDouble();

        System.out.println("Entre com o valor de B:");
        double b = scanner.nextDouble();

        System.out.println("Entre com o valor de C:");
        double c = scanner.nextDouble();

        double trinagulo = (a * c) / 2;
        double circulo = Math.PI * Math.pow(c, 2);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = Math.pow(b, 2);
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", trinagulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.println("RETANGULO: " + retangulo);
    }
}
