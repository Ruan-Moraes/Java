package edu.loiane.curso.exc.aula19;

public class Exc30 {
    public static void main(String[] args) {
        int[] vetorA = new int[20];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.round((float) Math.random() * 100);
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
            } else {
                vetorC[i] = vetorA[i];
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

        System.out.print("Vetor C = ");

        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
