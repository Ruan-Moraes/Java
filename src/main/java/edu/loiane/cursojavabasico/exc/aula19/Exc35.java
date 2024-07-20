package edu.loiane.cursojavabasico.exc.aula19;

public class Exc35 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 100);
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Elemento " + vetorA[i]);

            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.println(j + " é divisor de " + vetorA[i]);
                }
            }
        }
    }
}
