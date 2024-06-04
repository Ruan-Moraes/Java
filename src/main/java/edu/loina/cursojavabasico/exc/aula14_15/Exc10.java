package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em qual turno você estuda? (M - Matutino, V - Vespertino, N - Noturno)");
        String turno = scanner.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        }

        if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde!");
        }

        if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa noite!");
        }

        if (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("V") && !turno.equalsIgnoreCase("N")) {
            System.out.println("Turno inválido!");
        }
    }
}
