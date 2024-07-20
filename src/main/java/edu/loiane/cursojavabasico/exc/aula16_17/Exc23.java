package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int num = scanner.nextInt();

        List<Integer> numerosPrimos = new ArrayList<>();

        for (int i = 2; i < num + 1; i++) {
            boolean ePrimo = true;

            if (i == 2) {
                numerosPrimos.add(i);

                continue;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ePrimo = false;

                    System.out.println("Não é primo - O número " + i + " é divisível por " + j);

                    break;
                }
            }

            if (ePrimo) {
                numerosPrimos.add(i);
            }
        }

        System.out.println("Números primos até " + num + ": " + numerosPrimos);
    }
}
