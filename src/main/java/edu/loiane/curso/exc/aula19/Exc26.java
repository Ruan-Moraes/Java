package edu.loiane.curso.exc.aula19;

public class Exc26 {
    public static void main(String[] args) {
        int[] listaA = new int[10];
        int[] listaB = new int[10];
        int[] listaC = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = Math.round((float) Math.random() * 100);
            listaB[i] = Math.round((float) Math.random() * 100);
        }

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] > listaB[i]) {
                listaC[i] = 1;
            } else if (listaA[i] == listaB[i]) {
                listaC[i] = 0;
            } else {
                listaC[i] = -1;
            }
        }

        System.out.println("Lista A:");

        for (int i = 0; i < listaA.length; i++) {
            if (i == listaA.length - 1) {
                System.out.println(listaA[i]);
            } else {
                System.out.print(listaA[i] + " - ");
            }
        }

        System.out.println("Lista B:");

        for (int i = 0; i < listaB.length; i++) {
            if (i == listaB.length - 1) {
                System.out.println(listaB[i]);
            } else {
                System.out.print(listaB[i] + " - ");
            }
        }

        System.out.println("Lista C:");

        for (int i = 0; i < listaC.length; i++) {
            if (i == listaC.length - 1) {
                System.out.println(listaC[i]);
            } else {
                System.out.print(listaC[i] + " - ");
            }
        }
    }
}
