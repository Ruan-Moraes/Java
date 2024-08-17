package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número base: ");
        int base = scanner.nextInt();

        System.out.println("Informe o expoente: ");
        int expoente = scanner.nextInt();

        for (int i = 1; i < expoente; i++) {
            base *= base;
        }

        System.out.println("Resultado: " + base);
    }
}
