package edu.loiane.curso.exc.aula19;

public class Exc41 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int x = 5;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Elemento " + x + " encontrado no vetor A.");
        } else {
            System.out.println("Elemento " + x + " não encontrado no vetor A.");
        }
    }
}
