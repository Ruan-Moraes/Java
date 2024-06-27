package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome de usuário: ");
        String username = scanner.next();

        System.out.println("Informe sua senha: ");
        String password = scanner.next();

        if (username.equals(password))
            System.out.println("Usuário e senha não podem ser iguais.");
        else
            System.out.println("Usuário e senha cadastrados com sucesso.");
    }
}
