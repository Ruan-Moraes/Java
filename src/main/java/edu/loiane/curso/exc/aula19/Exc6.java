package edu.loiane.curso.exc.aula19;

public class Exc6 {
    public static void main(String[] args) {
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;

            listaB[i] = listaA[i] * i;
        }

        for (int i = 0; i < listaA.length; i++) {
            listaC[i] = listaB[i] + listaB[i];
        }

        System.out.println("Os valores da lista A são:");

        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i] + " ");
        }

        System.out.println("Os valores da lista B são:");

        for (int i = 0; i < listaB.length; i++) {
            System.out.println(listaB[i] + " ");
        }

        System.out.println("Os valores da lista C são:");

        for (int i = 0; i < listaC.length; i++) {
            System.out.println(listaC[i] + " ");
        }
    }
}
