package edu.loina.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de temperaturas que deseja informar: ");
        int quantidadeTemperaturas = scanner.nextInt();

        double temperatura;
        double soma = 0;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;

        for (int i = 0; i < quantidadeTemperaturas; i++) {
            System.out.println("Digite a temperatura: ");
            temperatura = scanner.nextDouble();

            soma += temperatura;

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }
        }

        System.out.println("Menor temperatura: " + menorTemperatura);
        System.out.println("Maior temperatura: " + maiorTemperatura);
        System.out.println("Média das temperaturas: " + (soma / quantidadeTemperaturas));
    }
}
