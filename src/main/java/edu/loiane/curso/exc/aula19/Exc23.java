package edu.loiane.curso.exc.aula19;

public class Exc23 {
    public static void main(String[] args) {
        int[] a = new int[10];

        boolean tudoEPar = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = i;

            if (a[i] % 2 == 0) {
                tudoEPar = true;
            } else {
                tudoEPar = false;

                break;
            }
        }

        if (tudoEPar) {
            System.out.println("Todos os números são pares");
        } else {
            System.out.println("Existem números ímpares");
        }
    }
}
