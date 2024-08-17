package edu.nelioalves.curso.exercicios.excs8.exc2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Funcionario> funcionarios = new HashMap<>();

        System.out.print("Digite o número de funcionários: ");
        int N = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o ID do funcionário " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();

            // Verificar se o ID já existe
            if (funcionarios.containsKey(id)) {
                System.out.println("ID já existe. Tente novamente.");

                i--;

                continue;
            }

            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();

            scanner.nextLine();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.put(id, funcionario);
        }

        // Ler ID e porcentagem para aumento
        System.out.print("Digite o ID do funcionário para aumento de salário: ");
        int idParaAumento = scanner.nextInt();

        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagemAumento = scanner.nextDouble();

        scanner.nextLine();

        if (funcionarios.containsKey(idParaAumento)) {
            Funcionario funcionario = funcionarios.get(idParaAumento);

            funcionario.aumentarSalario(porcentagemAumento);
        } else {
            System.out.println("ID não encontrado. Operação abortada.");

            scanner.close();

            return;
        }

        System.out.println("Listagem atualizada dos funcionários:");

        for (Funcionario funcionario : funcionarios.values()) {
            System.out.printf("ID: %d, Nome: %s, Salário: %.2f%n",
                    funcionario.getId(), funcionario.getNome(), funcionario.getSalario());
        }

        scanner.close();
    }
}
