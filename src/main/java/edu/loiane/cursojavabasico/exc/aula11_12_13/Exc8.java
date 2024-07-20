package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor/hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O salário do mês é " + salario);
    }
}
