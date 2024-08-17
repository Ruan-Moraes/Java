package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs6;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a largura do retângulo:");
        double width = scanner.nextDouble();

        System.out.println("Entre com a altura do retângulo:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimeter());
        System.out.println("DIAGONAL = " + rectangle.diagonal());
    }
}
