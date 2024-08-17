package edu.nelioalves.curso.exercicios.excs4;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 2002;

        while (true) {
            System.out.print("Digite sua senha: ");
            int senhaEscrita = scanner.nextInt();

            if (senhaEscrita == senha) {
                System.out.println("Acesso Permitido!");

                break;
            } else {
                System.out.println("Senha Inválida!");
            }
        }
    }
}
