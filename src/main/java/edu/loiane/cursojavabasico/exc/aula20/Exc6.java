package edu.loiane.cursojavabasico.exc.aula20;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] jogoDaVelha = new String[3][3];

        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = " ";
            }
        }

        imprimirJogoDaVelha(jogoDaVelha);

        int jogadas = 0;

        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Vez do jogador X");
            } else {
                System.out.println("Vez do jogador O");
            }

            System.out.print("Posição (linha e coluna) que deseja jogar (1-9): ");

            int posicaoJogada = scanner.nextInt();
            int linha = posicaoJogada / 3;
            int coluna = posicaoJogada % 3;

            if (coluna == 0) {
                linha = linha - 1;

                coluna = 2;
            } else {
                coluna = coluna - 1;
            }

            if (jogoDaVelha[linha][coluna].equals("X") || jogoDaVelha[linha][coluna].equals("O")) {
                System.out.println("Posição já utilizada, tente novamente.");

                i--;

                continue;
            }

            if (i % 2 == 0) {
                jogoDaVelha[linha][coluna] = "X";
            } else {
                jogoDaVelha[linha][coluna] = "O";
            }

            jogadas++;

            imprimirJogoDaVelha(jogoDaVelha);

            if (verificarGanhador(jogoDaVelha, "X")) {
                System.out.println("Jogador 1 ganhou!");

                break;
            } else if (verificarGanhador(jogoDaVelha, "O")) {
                System.out.println("Jogador 2 ganhou!");

                break;
            } else if (jogadas == 9) {
                System.out.println("Empate!");

                break;
            }
        }
    }

    private static boolean verificarGanhador(String[][] jogoDaVelha, String x) {
        if ((jogoDaVelha[0][0].equals(x) && jogoDaVelha[0][1].equals(x) && jogoDaVelha[0][2].equals(x))
                || (jogoDaVelha[1][0].equals(x) && jogoDaVelha[1][1].equals(x) && jogoDaVelha[1][2].equals(x))
                || (jogoDaVelha[2][0].equals(x) && jogoDaVelha[2][1].equals(x) && jogoDaVelha[2][2].equals(x))
                || (jogoDaVelha[0][0].equals(x) && jogoDaVelha[1][0].equals(x) && jogoDaVelha[2][0].equals(x))
                || (jogoDaVelha[0][1].equals(x) && jogoDaVelha[1][1].equals(x) && jogoDaVelha[2][1].equals(x))
                || (jogoDaVelha[0][2].equals(x) && jogoDaVelha[1][2].equals(x) && jogoDaVelha[2][2].equals(x))
                || (jogoDaVelha[0][0].equals(x) && jogoDaVelha[1][1].equals(x) && jogoDaVelha[2][2].equals(x))
                || (jogoDaVelha[0][2].equals(x) && jogoDaVelha[1][1].equals(x) && jogoDaVelha[2][0].equals(x))) {
            return true;
        }

        return false;
    }

    public static void imprimirJogoDaVelha(String[][] jogoDaVelha) {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                System.out.print(jogoDaVelha[i][j] + " | ");
            }

            System.out.println();
        }
    }
}