package edu.loiane.cursojavabasico.exc.aula19;

public class Exc42 {
    public static void main(String[] args) {

        int[] a = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];

                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Vetor A: ");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
