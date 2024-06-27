package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que deseja saber a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o início da tabuada: ");
        int inicio = scanner.nextInt();

        System.out.println("Digite o fim da tabuada: ");
        int fim = scanner.nextInt();

        while (inicio > fim) {
            System.out.println("Digite o fim da tabuada: ");

            fim = scanner.nextInt();
        }

        System.out.println("Tabuada de " + numero + ":");

        for (int i = inicio; i <= fim; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
