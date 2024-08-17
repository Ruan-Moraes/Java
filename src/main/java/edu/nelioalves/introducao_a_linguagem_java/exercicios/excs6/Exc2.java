package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs6;

import java.awt.*;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String name = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Valor do Imposto: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println();

        System.out.println("Funcionário: " + employee.getName() + ", R$ " + employee.netSalary());

        System.out.println();

        System.out.print("Digite a porcentagem para aumentar o salário: ");

        employee.increaseSalary(scanner.nextDouble());

        System.out.println();

        System.out.println("Dados atualizados: " + employee.getName() + ", R$ " + employee.netSalary());
    }
}
