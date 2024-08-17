package edu.nelioalves.curso.exercicios.excs6;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Entre com a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Entre com a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Entre com a terceira nota:");
        double nota3 = scanner.nextDouble();

        Student student = new Student(nome, nota1, nota2, nota3);

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.isApproved()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missingPoints() + " POINTS");
        }
    }
}
