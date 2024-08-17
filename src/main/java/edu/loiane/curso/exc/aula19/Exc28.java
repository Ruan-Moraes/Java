package edu.loiane.curso.exc.aula19;

public class Exc28 {
    public static void main(String[] args) {
        int[] listaA = new int[10];
        int[] listaB = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;

            listaB[9 - i] = listaA[i];
        }

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Lista A: " + listaA[i] + " - Lista B: " + listaB[i]);
        }
    }
}
