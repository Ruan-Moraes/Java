package edu.loiane.curso.exc.aula20;

public class Exc2 {
    public static void main(String[] args) {
//        Gere e imprima uma matriz M 10 x10 com valores aleatórios entre
//        0 - 9. Após isso indique qual é o maior e o menor valor da linha 5 e
//        qual é o maior e o menor valor da coluna 7.

        int[][] matriz = new int[10][10];

        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random() * 10);

                if (i == 5) {
                    if (matriz[i][j] > maiorL5) {
                        maiorL5 = matriz[i][j];
                    }
                    if (matriz[i][j] < menorL5) {
                        menorL5 = matriz[i][j];
                    }
                }

                if (j == 7) {
                    if (matriz[i][j] > maiorC7) {
                        maiorC7 = matriz[i][j];
                    }
                    if (matriz[i][j] < menorC7) {
                        menorC7 = matriz[i][j];
                    }
                }
            }
        }

        System.out.println("Matriz 10x10: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Maior valor da linha 5: " + maiorL5);
        System.out.println("Menor valor da linha 5: " + menorL5);
        System.out.println("Maior valor da coluna 7: " + maiorC7);
        System.out.println("Menor valor da coluna 7: " + menorC7);
    }
}
