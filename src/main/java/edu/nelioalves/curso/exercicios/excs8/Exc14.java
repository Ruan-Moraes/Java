package edu.nelioalves.curso.exercicios.excs8;

import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double somaAlturasMulheres = 0.0;
        int countMulheres = 0;
        int countHomens = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = scanner.nextDouble();

            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            generos[i] = scanner.next().charAt(0);

            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }

            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturasMulheres += alturas[i];

                countMulheres++;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                countHomens++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        if (countMulheres > 0) {
            double mediaAlturasMulheres = somaAlturasMulheres / countMulheres;

            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturasMulheres);
        } else {
            System.out.println("Nao ha mulheres no grupo.");
        }

        System.out.println("Numero de homens = " + countHomens);

        scanner.close();
    }
}
