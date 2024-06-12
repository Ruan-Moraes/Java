package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        String anoEscolhido = scanner.next().substring(2);

        int ano = Integer.parseInt(anoEscolhido);

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}
