package edu.nelioalves.curso.exercicios.excs8.exc3;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (ordem da matriz): ");
        int N = scanner.nextInt();

        int[][] matriz = new int[N][N];

        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);

                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < N; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        int contNegativos = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < 0) {
                    contNegativos++;
                }
            }
        }

        System.out.println("Quantidade de valores negativos: " + contNegativos);

        scanner.close();
    }
}
