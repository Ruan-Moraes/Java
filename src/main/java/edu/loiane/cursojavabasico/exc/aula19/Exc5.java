package edu.loiane.cursojavabasico.exc.aula19;

public class Exc5 {
    public static void main(String[] args) {
        int[] listaA = new int[15];
        int[] listaB = new int[15];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;

            listaB[i] = listaA[i] * i;
        }

        System.out.println("Lista A");

        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i] + " ");
        }

        System.out.println("Lista B");

        for (int i = 0; i < listaB.length; i++) {
            System.out.println(listaB[i] + " ");
        }
    }
}
