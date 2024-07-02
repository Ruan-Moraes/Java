package edu.loina.cursojavabasico.exc.aula19;

public class Exc25 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;

            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        System.out.println("Lista A:");

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + " - ");
            }
        }

        System.out.println("Lista B:");

        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + " - ");
            }
        }

    }
}
