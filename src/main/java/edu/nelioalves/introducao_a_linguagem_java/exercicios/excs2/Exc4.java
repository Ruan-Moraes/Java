package edu.nelioalves.introducao_a_linguagem_java.exercicios.excs2;

import java.util.Locale;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número do funcionário:");
        int numeroEmpregado = scanner.nextInt();

        System.out.println("Entre com o número de horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Entre com o valor que recebe por hora:");
        double salarioHora = scanner.nextDouble();

        double salario = horasTrabalhadas * salarioHora;

        System.out.println("NUMBER = " + numeroEmpregado);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
