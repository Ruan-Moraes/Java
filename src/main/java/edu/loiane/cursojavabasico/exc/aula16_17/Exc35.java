package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro até onde deseja saber os números primos:");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;

                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }
    }
}
