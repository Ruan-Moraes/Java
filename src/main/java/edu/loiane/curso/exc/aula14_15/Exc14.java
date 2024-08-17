package edu.loiane.curso.exc.aula14_15;

import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito;
        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if (media >= 0 && media < 4) {
            conceito = "E";
        } else {
            conceito = "Nota inválida";
        }

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
