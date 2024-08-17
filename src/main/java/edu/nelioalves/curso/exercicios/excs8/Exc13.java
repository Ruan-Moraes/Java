package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String[] nomes = new String[n];
        double[] primeiraNota = new double[n];
        double[] segundaNota = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            nomes[i] = scanner.nextLine();
            primeiraNota[i] = scanner.nextDouble();
            segundaNota[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            double media = (primeiraNota[i] + segundaNota[i]) / 2.0;

            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
