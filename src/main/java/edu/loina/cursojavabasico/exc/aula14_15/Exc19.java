package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro (Até 1000): ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 1000) {
            System.out.println("Número inválido");

            return;
        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        System.out.println(centenas + " centenas, " + dezenas + " dezenas e " + unidades + " unidades");
    }
}
