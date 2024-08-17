package edu.loiane.curso.exc.aula20;

public class Exc1 {
    public static void main(String[] args) {
        int[][][][] matriz4x4 = new int[4][4][4][4];

        int maiorValor = 0;
        int[] indicesDoMaiorValor = new int[4];

        for (int i = 0; i < matriz4x4.length; i++) {
            for (int j = 0; j < matriz4x4[i].length; j++) {
                for (int k = 0; k < matriz4x4[i][j].length; k++) {
                    for (int l = 0; l < matriz4x4[i][j][k].length; l++) {
                        matriz4x4[i][j][k][l] = Math.round((float) Math.random() * 100);

                        if (matriz4x4[i][j][k][l] > maiorValor) {
                            maiorValor = matriz4x4[i][j][k][l];

                            indicesDoMaiorValor[0] = i;
                            indicesDoMaiorValor[1] = j;
                            indicesDoMaiorValor[2] = k;
                            indicesDoMaiorValor[3] = l;
                        }
                    }
                }
            }
        }

        System.out.println("Maior valor: " + maiorValor);
        System.out.print("Índices do maior valor: ");

        for (int i = 0; i < indicesDoMaiorValor.length; i++) {
            System.out.print(indicesDoMaiorValor[i] + " ");
        }
    }
}
