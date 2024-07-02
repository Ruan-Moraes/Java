package edu.loina.cursojavabasico.exc.aula19;

public class Exc36 {
    public static void main(String[] args) {
        int[] vetorA = new int[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento: " + vetorA[i]);
        }
    }
}
