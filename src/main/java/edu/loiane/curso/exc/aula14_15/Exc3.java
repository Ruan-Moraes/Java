package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu gênero (M/F): ");
        String genero = scanner.next();

        if (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F")) {
            System.out.println("Gênero inválido");

            return;
        }

        if (genero.equalsIgnoreCase("M")) {
            System.out.println("Gênero masculino");
        } else {
            System.out.println("Gênero feminino");
        }
    }
}
