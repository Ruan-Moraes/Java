package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Exc45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] gabaritoDaProva = {
                {"01", null},
                {"02", null},
                {"03", null},
                {"04", null},
                {"05", null},
                {"06", null},
                {"07", null},
                {"08", null},
                {"09", null},
                {"10", null}
        };

        for (int i = 0; i < gabaritoDaProva.length; i++) {
            System.out.printf("Digite a resposta da questão %s (A, B, C, D, E): ", gabaritoDaProva[i][0]);

            gabaritoDaProva[i][1] = scanner.next().toUpperCase();
        }

        Map<Integer, String> tabelaResposta = Map.of(
                0, "A",
                1, "B",
                2, "C",
                3, "D",
                4, "E"
        );

        int numerosDeAlunos = 40;
        int[] notasAlunos = new int[40];

        for (int i = 0; i < numerosDeAlunos; i++) {
            int[] respostasDoAluno = {
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4),
                    Math.round((float) Math.random() * 4)
            };

            int totalDePontos = 0;

            for (int j = 0; j < gabaritoDaProva.length; j++) {
                if (gabaritoDaProva[j][1].equals(tabelaResposta.get(respostasDoAluno[j]))) {
                    totalDePontos++;
                }
            }

            notasAlunos[i] = totalDePontos;

            System.out.printf("Aluno %d: %d pontos%n", i + 1, totalDePontos);
        }

        int menorNota = Arrays.stream(notasAlunos).min().getAsInt();
        int maiorNota = Arrays.stream(notasAlunos).max().getAsInt();

        double mediaDasNotas = Arrays.stream(notasAlunos).average().getAsDouble();

        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Média das notas: " + mediaDasNotas);
    }
}
