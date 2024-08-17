package edu.loiane.curso.exc.aula19;

public class Exc22 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.random() > 0.5 ? 1 : 0;
        }

        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 0) {
                qtd0++;
            } else {
                qtd1++;
            }
        }

        System.out.println("Percentual de 0: " + (qtd0 * 100) / vetorA.length + "%");
        System.out.println("Percentual de 1: " + (qtd1 * 100) / vetorA.length + "%");
    }
}
