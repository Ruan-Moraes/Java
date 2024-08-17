package edu.loiane.curso.exc.aula34;

public class Contador {
    private static int cont = 0;

    public Contador() {
        cont++;
    }

    public static void incrementar() {
        cont++;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int getCont() {
        return cont;
    }
}
