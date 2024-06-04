package edu.loina.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu gênero (M/F): ");
        String genero = scan.next();

        if (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
            System.out.println("Gênero inválido");

            return;
        }

        if (genero.equalsIgnoreCase("M")) {
            double pesoIdeal = (72.7 * altura) - 58;

            System.out.println("Seu peso ideal é " + pesoIdeal);
        }

        if (genero.equalsIgnoreCase("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;

            System.out.println("Seu peso ideal é " + pesoIdeal);
        }
    }
}
