package edu.loiane.cursojavabasico.aulas.aula17;

public class LoopWhile {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("i tem valor: " + i);
        }

        // For com mais de uma variável

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }

        // For com partes ausentes

        int count = 0;

        for (; count < 10; ) {
            System.out.println("valor de count: " + count);
            count += 2;
        }

        // For infinito

        // For (;;) {}

        // For-each

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
