package edu.loiane.cursojavabasico.exc.aula19;

public class Exc31 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.round((float) Math.random() * 100);
        }

        int posB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
