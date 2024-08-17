package edu.loiane.curso.exc.aula19;

public class Exc32 {
    public static void main(String[] args) {
        int[] vetorTabuada = new int[5];

        for (int i = 0; i < vetorTabuada.length; i++) {
            vetorTabuada[i] = i + 1;
        }

        for (int i = 1; i <= vetorTabuada.length; i++) {
            System.out.println("Tabuada de " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
