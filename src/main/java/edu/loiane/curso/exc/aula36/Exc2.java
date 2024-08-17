package edu.loiane.curso.exc.aula36;

public class Exc2 {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlinhos", "Tutoria", "professor1@email.com");

        Aluno aluno = new Aluno("Batata", "123456");
        Aluno aluno2 = new Aluno("Arroz", "114456");
        Aluno aluno3 = new Aluno("Joãozinho do balacobaco", "124456");
        Aluno aluno4 = new Aluno("Carla", "134456");

        Curso ENG = new Curso("Engenharia", "19:00", professor, new Aluno[]{aluno, aluno2, aluno3, aluno4});

        ENG.imprimirCurso();

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();

        ENG.imprimirNotasAlunos();

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();

        ENG.mediaTurma();

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();

        ENG.statusAlunos();
    }
}
