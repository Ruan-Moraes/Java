package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("A soma dos números é: " + (num1 + num2));
    }
}
