package edu.loiane.curso.exc.aula11_12_13;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é " + area);
    }
}
