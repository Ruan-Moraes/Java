package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas turmas deseja informar?");
        int qtdTurmas = scanner.nextInt();

        int[] qtdAlunosPorTurma = new int[qtdTurmas];

        for (int i = 0; i < qtdTurmas; i++) {
            System.out.println("Quantos alunos há na turma " + (i + 1) + "?");

            qtdAlunosPorTurma[i] = scanner.nextInt();
        }

        int somaAlunos = 0;

        for (int qtdAlunos : qtdAlunosPorTurma) {
            somaAlunos += qtdAlunos;
        }

        double mediaAlunosPorTurma = (double) somaAlunos / qtdTurmas;

        System.out.println("A média de alunos por turma é: " + mediaAlunosPorTurma);

        if (mediaAlunosPorTurma <= 40) {
            System.out.println("Turmas com quantidade de alunos dentro do limite");
        } else {
            System.out.println("Turmas com quantidade de alunos acima do limite");
        }
    }
}
