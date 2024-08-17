package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Informe o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Informe o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}