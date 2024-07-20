package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite um número real: ");
        double num3 = scan.nextDouble();

        int result1 = (num1 * 2) * (num2 / 2);
        double result2 = (num1 * 3) + num3;
        double result3 = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é " + result1);
        System.out.println("A soma do triplo do primeiro com o terceiro é " + result2);
        System.out.println("O terceiro elevado ao cubo é " + result3);
    }
}
