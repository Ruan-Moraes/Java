package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para a tabuada: ");
        int num = scanner.nextInt();

        if (num < 0 || num > 10) {
            System.out.println("Número inválido. Digite um número entre 1 e 10.");

            return;
        }

        System.out.println("Tabuada de " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
