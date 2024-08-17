package edu.loiane.curso.exc.aula19;

public class Exc11 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = i + 1;
        }

        for (int i = 0; i < listaA.length; i++) {
            String ePar = listaA[i] % 2 == 0 ? "é par" : "NÃO é par";

            System.out.println("listaA[" + i + "] = " + listaA[i] + " " + ePar);
        }
    }
}
