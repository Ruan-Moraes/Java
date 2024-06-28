package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exc46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do atleta (ou deixe em branco para encerrar): ");
            String nomeAtleta = scanner.nextLine();

            if (nomeAtleta.isBlank()) {
                break;
            }

            ArrayList<Double> saltos = new ArrayList<>();

            for (int i = 1; i <= 5; i++) {
                System.out.printf("Digite a distância do %dº salto: ", i);

                double salto = scanner.nextDouble();

                saltos.add(salto);
            }

            scanner.nextLine();

            System.out.println("\nAtleta: " + nomeAtleta);
            System.out.println(String.format("Primeiro Salto: %.1f m", saltos.get(0)));
            System.out.println(String.format("Segundo Salto: %.1f m", saltos.get(1)));
            System.out.println(String.format("Terceiro Salto: %.1f m", saltos.get(2)));
            System.out.println(String.format("Quarto Salto: %.1f m", saltos.get(3)));
            System.out.println(String.format("Quinto Salto: %.1f m", saltos.get(4)));

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);

            double soma = 0;

            for (double salto : saltos) {
                soma += salto;
            }

            double media = soma / saltos.size();

            System.out.println(String.format("Melhor salto: %.1f m", melhorSalto));
            System.out.println(String.format("Pior salto: %.1f m", piorSalto));
            System.out.println(String.format("Média dos demais saltos: %.1f m", media));
            System.out.println(String.format("Resultado final:\n%s: %.1f m\n", nomeAtleta, media));
        }
    }
}
