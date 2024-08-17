package edu.nelioalves.curso.exercicios.excs3;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a hora inicial do jogo:");
        int horaInicial = scanner.nextInt();

        System.out.println("Entre com a hora final do jogo:");
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
