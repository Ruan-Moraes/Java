package edu.loiane.cursojavabasico.exc.aula19;

public class Exc24 {
    public static void main(String[] args) {
        int[] a = new int[10];

        boolean tudoEPolindromo = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[a.length - 1 - i]) {
                tudoEPolindromo = true;
            } else {
                tudoEPolindromo = false;

                break;
            }
        }

        if (tudoEPolindromo) {
            System.out.println("Todos os números são polindromos");
        } else {
            System.out.println("Existem números que não são polindromos");
        }
    }
}
