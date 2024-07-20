package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salario do funcionário: ");
        double salario = scanner.nextDouble();

        double salarioAjustado = 0;
        double percentualAumento = 0;

        if (salario <= 280) {
            percentualAumento = 20;

            salarioAjustado = salario + salario * percentualAumento / 100;
        } else if (salario > 280 && salario <= 700) {
            percentualAumento = 15;

            salarioAjustado = salario + salario * percentualAumento / 100;
        } else if (salario > 700 && salario <= 1500) {
            percentualAumento = 10;

            salarioAjustado = salario + salario * 100 / percentualAumento;
        } else {
            percentualAumento = 5;

            salarioAjustado = salario + salario * 100 / percentualAumento;
        }

        double valorAumento = salarioAjustado - salario;

        System.out.println("Salário: " + salario);
        System.out.println("Percentual de aumento: " + percentualAumento);
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
