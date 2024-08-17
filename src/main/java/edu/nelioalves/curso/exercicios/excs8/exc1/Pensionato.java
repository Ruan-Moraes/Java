package edu.nelioalves.curso.exercicios.excs8.exc1;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudante[] quartos = new Estudante[10];

        System.out.print("Digite o número de estudantes que vão alugar quartos (1 a 10): ");
        int N = scanner.nextInt();

        scanner.nextLine();

        if (N < 1 || N > 10) {
            System.out.println("Número inválido de estudantes.");
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o nome do estudante " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o email do estudante " + (i + 1) + ": ");
            String email = scanner.nextLine();

            System.out.print("Digite o número do quarto (0 a 9) para o estudante " + (i + 1) + ": ");
            int quartoEscolhido = scanner.nextInt();

            scanner.nextLine();

            if (quartoEscolhido < 0 || quartoEscolhido > 9) {
                System.out.println("Número de quarto inválido.");
                continue;
            }

            if (quartos[quartoEscolhido] != null) {
                System.out.println("Quarto " + quartoEscolhido + " já está ocupado. Escolha outro quarto.");
                continue;
            }

            quartos[quartoEscolhido] = new Estudante(nome, email, quartoEscolhido);
        }

        System.out.println("Relatório de ocupação dos quartos:");

        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] == null) {
                System.out.println("Quarto " + i + ": Vago");
            } else {
                System.out.println("Quarto " + i + ": Ocupado por " + quartos[i].nome + " (Email: " + quartos[i].email + ")");
            }
        }

        scanner.close();
    }
}
