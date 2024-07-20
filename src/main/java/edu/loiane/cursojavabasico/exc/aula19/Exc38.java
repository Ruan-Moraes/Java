package edu.loiane.cursojavabasico.exc.aula19;

public class Exc38 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = i; j < vetorA.length; j++) {
                vetorB[i] += vetorA[j];
            }
        }

        System.out.print("Vetor A = ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B = ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();
    }
}
