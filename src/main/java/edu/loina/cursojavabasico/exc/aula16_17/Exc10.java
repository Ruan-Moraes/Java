package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int num = scanner.nextInt();

        System.out.println("Informe outro número inteiro: ");
        int num2 = scanner.nextInt();

        for (int i = num; i <= num2; i++) {
            System.out.println("Os números do intervalo são: " + i);
        }
    }
}
