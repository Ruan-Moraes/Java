package edu.loina.cursojavabasico.exc.aula19;

public class Exc27 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        char[] listaB = new char[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = Math.round((float) Math.random() * 100);

            if (listaA[i] < 7) {
                listaB[i] = 'a';
            } else if (listaA[i] == 7) {
                listaB[i] = 'b';
            } else if (listaA[i] > 7 && listaA[i] < 10) {
                listaB[i] = 'c';
            } else if (listaA[i] == 10) {
                listaB[i] = 'd';
            } else {
                listaB[i] = 'e';
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
    }
}
