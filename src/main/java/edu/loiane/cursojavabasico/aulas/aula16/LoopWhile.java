package edu.loiane.cursojavabasico.aulas.aula16;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        System.out.println(i); // 11

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);
    }
}
