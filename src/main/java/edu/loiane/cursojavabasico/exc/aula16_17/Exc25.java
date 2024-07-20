package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas idades deseja informar?");
        int qtdIdades = scanner.nextInt();

        int[] idades = new int[qtdIdades];

        for (int i = 0; i < qtdIdades; i++) {
            System.out.println("Entre com a idade " + (i + 1) + ": ");

            idades[i] = scanner.nextInt();
        }

        double somaIdades = 0;

        for (int idade : idades) {
            somaIdades += idade;
        }

        double mediaIdades = somaIdades / qtdIdades;

        System.out.println("A média das idades é: " + mediaIdades);

        if (mediaIdades >= 0 && mediaIdades <= 25) {
            System.out.println("Jovem");
        } else if (mediaIdades > 25 && mediaIdades <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
