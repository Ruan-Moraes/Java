package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalVotos = 0;

        System.out.println("Digite os votos (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para encerrar):");

        while (true) {
            int voto = scanner.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;

                    break;
                case 5:
                    votosNulos++;

                    break;
                case 6:
                    votosBrancos++;

                    break;
                default:
                    System.out.println("Voto inválido! Tente novamente.");

                    continue;
            }

            totalVotos++;
        }

        System.out.println("Resultado da Eleição:");

        for (int i = 0; i < 4; i++) {
            System.out.printf("Total de votos para o Candidato %d: %d%n", i + 1, votosCandidatos[i]);
        }

        System.out.printf("Total de votos nulos: %d%n", votosNulos);
        System.out.printf("Total de votos em branco: %d%n", votosBrancos);
        System.out.printf("Percentagem de votos nulos: %.2f%%%n", (votosNulos * 100.0) / totalVotos);
        System.out.printf("Percentagem de votos em branco: %.2f%%%n", (votosBrancos * 100.0) / totalVotos);
    }
}
