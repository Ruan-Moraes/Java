package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double num = scanner.nextDouble();

        if (num > (int) num) {
            System.out.println("Número decimal");
        } else {
            System.out.println("Número inteiro");
        }
    }
}
