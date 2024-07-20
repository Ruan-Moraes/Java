package edu.loiane.cursojavabasico.exc.aula19;

public class Exc13 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) Math.round(Math.random() * 100);
        }

        int somaTotal = 0;

        for (int i = 0; i < listaA.length; i++) {
            int eMultipoDeCinco = listaA[i] % 5 == 0 ? listaA[i] : 0;

            if (eMultipoDeCinco > 0) {
                somaTotal += listaA[i];
            }
        }

        System.out.println("Soma total: " + somaTotal);
    }
}
