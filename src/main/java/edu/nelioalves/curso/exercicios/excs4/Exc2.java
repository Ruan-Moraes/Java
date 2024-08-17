package edu.nelioalves.curso.exercicios.excs4;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entre com a coordenada [X]: ");
            int x = scanner.nextInt();

            System.out.print("Entre com a coordenada [Y]: ");
            int y = scanner.nextInt();

            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else if (x < 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            }
        }
    }
}
