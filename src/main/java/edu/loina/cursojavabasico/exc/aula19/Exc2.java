package edu.loina.cursojavabasico.exc.aula19;

public class Exc2 {
    public static void main(String[] args) {
        int[] listaA = new int[8];
        int[] listaB = new int[8];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;

            listaB[i] = listaA[i] * 2;
        }

        System.out.println("Os valores de listaA são:");

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("listaA[" + i + "] = " + listaA[i]);
        }

        System.out.println("Os valores de listaB são:");

        for (int i = 0; i < listaB.length; i++) {
            System.out.println("listaB[" + i + "] = " + listaB[i]);
        }
    }
}
