package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a população do país A:");
        int populacaoPaisA = scanner.nextInt();

        if (populacaoPaisA <= 0) {
            System.out.println("População do país A deve ser maior que 0.");

            return;
        }

        System.out.println("Informe a população do país B:");
        int populacaoPaisB = scanner.nextInt();

        if (populacaoPaisB <= 0) {
            System.out.println("População do país B deve ser maior que 0.");

            return;
        }

        System.out.println("Informe a taxa de crescimento do país A:");
        double taxaCrescimentoA = scanner.nextDouble();

        System.out.println("Informe a taxa de crescimento do país B:");
        double taxaCrescimentoB = scanner.nextDouble();

        int anos = 0;

        if (populacaoPaisA > populacaoPaisB) {
            return;
        }

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += populacaoPaisA * taxaCrescimentoA;
            populacaoPaisB += populacaoPaisB * taxaCrescimentoB;

            anos++;
        }

        System.out.println("População A: " + populacaoPaisA);
        System.out.println("População B: " + populacaoPaisB);

        System.out.println("Até o ano " + anos + " a população do país A será maior que a população do país B.");
    }
}
