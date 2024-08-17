package edu.loiane.curso.exc.aula19;

public class Exc40 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                c[i] = a[i];
            }
        }

        System.out.print("Vetor A: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor C: ");

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
