package edu.loiane.curso.exc.aula19;

public class Exc37 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = i + 1;
            vetorB[i] = 1;

            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
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
    }
}
