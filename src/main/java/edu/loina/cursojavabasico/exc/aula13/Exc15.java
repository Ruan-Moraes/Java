package edu.loina.cursojavabasico.exc.aula13;

import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Imposto de Renda: R$ " + impostoDeRenda);
        System.out.println("INSS: R$ " + inss);
        System.out.println("Sindicato: R$ " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }
}
