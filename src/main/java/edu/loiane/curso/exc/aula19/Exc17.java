package edu.loiane.curso.exc.aula19;

public class Exc17 {
    public static void main(String[] args) {
        int[] idadesDePessoas = new int[10];

        for (int i = 0; i < idadesDePessoas.length; i++) {
            idadesDePessoas[i] = (int) Math.round(Math.random() * 100);
        }

        int somaDasIdades = 0;

        for (int i = 0; i < idadesDePessoas.length; i++) {
            somaDasIdades += idadesDePessoas[i];
        }

        System.out.println("Média das idades: " + somaDasIdades / idadesDePessoas.length);
    }
}
