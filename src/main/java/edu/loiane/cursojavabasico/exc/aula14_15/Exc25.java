package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        System.out.println("Telefonou para a vítima? (sim/nao) ");
        String resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            cont++;
        }

        System.out.println("Esteve no local do crime? (sim/nao) ");
        resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            cont++;
        }

        System.out.println("Mora perto da vítima? (sim/nao) ");
        resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            cont++;
        }

        System.out.println("Devia para a vítima? (sim/nao) ");
        resposta = scanner.next();

        if (resposta.equalsIgnoreCase("sim")) {
            cont++;
        }

        System.out.println("Já trabalhou com a vítima? (sim/nao) ");
        resposta = scanner.next();


        if (resposta.equalsIgnoreCase("sim")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
