package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int num2 = scanner.nextInt();

        int soma = 0;

        for (int i = num; i <= num2; i++) {
            soma += i;

            System.out.println("Os números do intervalo são: " + i);
        }

        System.out.println("A soma dos números do intervalo é: " + soma);
    }
}
