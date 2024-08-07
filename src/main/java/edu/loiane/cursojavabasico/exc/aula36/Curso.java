package edu.loiane.cursojavabasico.exc.aula36;

import java.util.Arrays;

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private Aluno[] alunos;

    public void imprimirNotasAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Notas do aluno " + aluno.getNome());

            double[] notas = aluno.getNotas();

            for (int i = 0; i < notas.length; i++) {
                System.out.println(notas[i] + " ");
            }

            System.out.println();
        }
    }

    public void mediaTurma() {
        double media = 0;
        double soma = 0;

        int totalNotas = 0;

        for (Aluno aluno : alunos) {
            double[] notas = aluno.getNotas();

            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];

                totalNotas++;
            }
        }

        media = soma / totalNotas;

        System.out.println("Média da turma: " + media);
    }

    public void imprimirCurso() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Horário do curso: " + horario);
        System.out.println("Professor do curso: " + professor.getNome());
        System.out.println("Departamento do professor: " + professor.getDepartamento());
        System.out.println("Email do professor: " + professor.getEmail());

        System.out.println("_________________");
        System.out.println("Alunos do curso: ");

        for (Aluno aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno.getNome());
            System.out.println("Matrícula do aluno: " + aluno.getMatricula());

            System.out.println();
        }
    }

    public void statusAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno.getNome());

            double notaAluno = 0;
            double[] notas = aluno.getNotas();

            for (int i = 0; i < notas.length; i++) {
                notaAluno += notas[i];
            }

            System.out.println("Média do aluno: " + (notaAluno / notas.length));

            if (notaAluno / notas.length >= 7) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println();
        }
    }

    public Curso(String nome, String horario, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", horario='" + horario + '\'' +
                ", professor=" + professor +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
