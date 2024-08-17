package edu.loiane.curso.exc.aula25_27;

public class Exc3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "João",
                "123456",
                "Ciência da Computação",
                new String[]{"Matemática", "Física", "Química"},
                new double[][]{{7, 8, 9}, {5, 6, 7}, {3, 4, 5}}
        );

        System.out.println(aluno);

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Aprovado em " + aluno.getDisciplinas()[i]);
            } else {
                System.out.println("Reprovado em " + aluno.getDisciplinas()[i]);
            }
        }

        System.out.println("Média: " + aluno.calcularMedia(0));
        System.out.println("Média: " + aluno.calcularMedia(1));
    }
}
