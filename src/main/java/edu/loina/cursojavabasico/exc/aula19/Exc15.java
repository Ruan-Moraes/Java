package edu.loina.cursojavabasico.exc.aula19;

public class Exc15 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) Math.round(Math.random() * 100);
        }

        int totalNumerosImpares = 0;
        int totalNumerosPares = 0;

        for (int i = 0; i < listaA.length; i++) {
            int eImpar = listaA[i] % 2 == 1 ? listaA[i] : 0;

            if (eImpar > 0) {
                totalNumerosImpares++;
            } else {
                totalNumerosPares++;
            }
        }

        System.out.println("Percentual de números ímpares: " + (totalNumerosImpares * 100) / listaA.length + "%");
        System.out.println("Percentual de números pares: " + (totalNumerosPares * 100) / listaA.length + "%");
    }
}
