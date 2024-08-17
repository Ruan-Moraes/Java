package edu.loiane.curso.exc.aula16_17;

import java.util.Arrays;
import java.util.Scanner;

public class Exc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");

            numeros[i] = scanner.nextInt();
        }

        Arrays.stream(numeros).min().ifPresent(min -> System.out.println("O menor número é " + min));

        Arrays.stream(numeros).max().ifPresent(max -> System.out.println("O maior número é " + max));

        int soma = Arrays.stream(numeros).sum();

        System.out.println("A soma dos números é " + soma);
    }
}
