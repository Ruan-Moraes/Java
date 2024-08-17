package edu.nelioalves.curso.exercicios.excs8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int N = scanner.nextInt();

        scanner.nextLine();

        List<String> nomesMenos16 = new ArrayList<>();

        double somaAlturas = 0;
        int contadorMenos16 = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Dados da " + i + "a pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            scanner.nextLine();

            somaAlturas += altura;

            if (idade < 16) {
                nomesMenos16.add(nome);

                contadorMenos16++;
            }
        }

        double alturaMedia = somaAlturas / N;
        double porcentagemMenos16 = (contadorMenos16 / (double) N) * 100;

        System.out.printf("Altura média: %.2f%n", alturaMedia);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenos16);
        for (String nome : nomesMenos16) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
