package edu.loiane.curso.aulas.aula06;

public class Argumentos {
    public static void main(String[] args) {
        System.out.println("Você digitou " + args.length + " argumentos.");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + (i + 1) + ": " + args[i]);
        }
    }
}
