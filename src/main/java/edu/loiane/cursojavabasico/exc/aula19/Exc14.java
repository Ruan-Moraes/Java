package edu.loiane.cursojavabasico.exc.aula19;

public class Exc14 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) Math.round(Math.random() * 100);
        }

        int somaTotal = 0;

        for (int i = 0; i < listaA.length; i++) {
            int eImpar = listaA[i] % 2 == 1 ? listaA[i] : 0;

            if (eImpar > 0) {
                somaTotal += listaA[i];
            }
        }

        double media = somaTotal / listaA.length;

        System.out.println("Média: " + media);
    }
}
