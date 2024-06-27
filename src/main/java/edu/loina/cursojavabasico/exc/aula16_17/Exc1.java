package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        System.out.println("Por favor informe um número entre 0 e 10: ");
        valor = scanner.nextInt();

        while (!(valor <= 10 && valor >= 0)) {
            System.out.println("Por favor informe um número entre 0 e 10: ");
            valor = scanner.nextInt();
        }

        System.out.println("Você informou um valor válido.");
    }
}
