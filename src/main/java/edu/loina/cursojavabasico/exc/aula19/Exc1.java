package edu.loina.cursojavabasico.exc.aula19;

public class Exc1 {
    public static void main(String[] args) {
        int[] listaA = new int[5];
        int[] listaB = new int[5];

        listaA[0] = 1;
        listaA[1] = 2;
        listaA[2] = 3;
        listaA[3] = 4;
        listaA[4] = 5;

        listaB[0] = 1;
        listaB[1] = 2;
        listaB[2] = 3;
        listaB[3] = 4;
        listaB[4] = 5;

        for (int i = 0; i < listaA.length; i++) {
            boolean iguais = listaA[i] == listaB[i];

            System.out.println("listaA[" + i + "] = " + listaA[i] + " | listaB[" + i + "] = " + listaB[i] + " | iguais = " + iguais);
        }
    }
}
