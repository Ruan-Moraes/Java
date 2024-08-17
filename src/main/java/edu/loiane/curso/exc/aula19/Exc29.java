package edu.loiane.curso.exc.aula19;

public class Exc29 {
    public static void main(String[] args) {
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[20];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = Math.round((float) Math.random() * 100);
            listaB[i] = Math.round((float) Math.random() * 100);

            listaC[i] = listaA[i];

            listaC[i + 10] = listaB[i];
        }

        for (int i = 0; i < listaA.length; i++) {
            System.out.println("Lista A: " + listaA[i] + " - Lista B: " + listaB[i]);
        }

        for (int i = 0; i < listaC.length; i++) {
            System.out.println("Lista C: " + listaC[i]);
        }

    }
}
