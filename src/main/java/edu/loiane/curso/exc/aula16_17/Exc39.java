package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoMaisAlto = 0, numeroAlunoMaisBaixo = 0;
        int alturaMaisAlta = 0, alturaMaisBaixa = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno " + i + ": ");
            int numeroAluno = scanner.nextInt();
            System.out.print("Digite a altura do aluno " + i + " (em cm): ");
            int altura = scanner.nextInt();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                numeroAlunoMaisAlto = numeroAluno;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                numeroAlunoMaisBaixo = numeroAluno;
            }
        }

        System.out.println("Aluno mais alto: Número " + numeroAlunoMaisAlto + ", Altura: " + alturaMaisAlta + " cm");
        System.out.println("Aluno mais baixo: Número " + numeroAlunoMaisBaixo + ", Altura: " + alturaMaisBaixa + " cm");
    }
}
