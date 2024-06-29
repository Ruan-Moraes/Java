package edu.loina.cursojavabasico.exc.aula19;

public class Exc12 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;
        }

        int somaTotal = 0;

        for (int i = 0; i < listaA.length; i++) {
            somaTotal += listaA[i];
        }

        System.out.println("Soma total: " + somaTotal);
    }
}
