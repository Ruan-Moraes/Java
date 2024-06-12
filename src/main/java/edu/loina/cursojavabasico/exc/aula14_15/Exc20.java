package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com distinção!");
        }

        if (media >= 7) {
            System.out.println("Aprovado! média: " + media);
        }

        if (media < 7) {
            System.out.println("Reprovado! média: " + media);
        }
    }
}
