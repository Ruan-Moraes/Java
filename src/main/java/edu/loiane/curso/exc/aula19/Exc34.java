package edu.loiane.curso.exc.aula19;

public class Exc34 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 100);
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + ": ");

            for (int j = 0; j <= vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
