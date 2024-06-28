package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exc47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do ginasta (ou deixe em branco para encerrar): ");
            String nomeGinasta = scanner.nextLine();

            if (nomeGinasta.isBlank()) {
                break;
            }

            ArrayList<Double> notas = new ArrayList<>();

            for (int i = 1; i <= 7; i++) {
                System.out.printf("Digite a nota do %dº jurado: ", i);

                double nota = scanner.nextDouble();

                notas.add(nota);
            }

            scanner.nextLine();
            
            System.out.println("\nAtleta: " + nomeGinasta);

            for (int i = 0; i < notas.size(); i++) {
                System.out.println(String.format("Nota: %.1f", notas.get(i)));
            }

            double melhorNota = Collections.max(notas);
            double piorNota = Collections.min(notas);

            notas.remove(melhorNota);
            notas.remove(piorNota);

            double soma = 0;

            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();

            System.out.println("\nResultado final:");
            System.out.println(String.format("Atleta: %s", nomeGinasta));
            System.out.println(String.format("Melhor nota: %.1f", melhorNota));
            System.out.println(String.format("Pior nota: %.1f", piorNota));
            System.out.println(String.format("Média: %.2f", media));
        }
    }
}
