package edu.loiane.cursojavabasico.exc.aula14_15;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        int IR5 = 5;
        int IR10 = 10;
        int IR20 = 20;

        int INSS = 10;

        int FGTS = 11;

        if (salario <= 900) {
            System.out.println("ISENTO");
        }

        if (salario > 900 && salario <= 1500) {
            double IR = (salario * IR5) / 100;
            double INSSValue = (salario * INSS) / 100;
            double FGTSValue = (salario * FGTS) / 100;
            double totalDescontos = IR + INSSValue;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Salário Bruto: (" + salario + ")");
            System.out.println("(-) IR (" + IR5 + "%): " + IR);
            System.out.println("(-) INSS (" + INSS + "%): " + INSSValue);
            System.out.println("FGTS (" + FGTS + "%): " + FGTSValue);
            System.out.println("Total de descontos: " + totalDescontos);
            System.out.println("Salário Líquido: " + salarioLiquido);
        }

        if (salario > 1500 && salario <= 2500) {
            double IR = (salario * IR10) / 100;
            double INSSValue = (salario * INSS) / 100;
            double FGTSValue = (salario * FGTS) / 100;
            double totalDescontos = IR + INSSValue;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Salário Bruto: (" + salario + ")");
            System.out.println("(-) IR (" + IR10 + "%): " + IR);
            System.out.println("(-) INSS (" + INSS + "%): " + INSSValue);
            System.out.println("FGTS (" + FGTS + "%): " + FGTSValue);
            System.out.println("Total de descontos: " + totalDescontos);
            System.out.println("Salário Líquido: " + salarioLiquido);
        }

        if (salario > 2500) {
            double IR = (salario * IR20) / 100;
            double INSSValue = (salario * INSS) / 100;
            double FGTSValue = (salario * FGTS) / 100;
            double totalDescontos = IR + INSSValue;
            double salarioLiquido = salario - totalDescontos;

            System.out.println("Salário Bruto: (" + salario + ")");
            System.out.println("(-) IR (" + IR20 + "%): " + IR);
            System.out.println("(-) INSS (" + INSS + "%): " + INSSValue);
            System.out.println("FGTS (" + FGTS + "%): " + FGTSValue);
            System.out.println("Total de descontos: " + totalDescontos);
            System.out.println("Salário Líquido: " + salarioLiquido);
        }
    }
}