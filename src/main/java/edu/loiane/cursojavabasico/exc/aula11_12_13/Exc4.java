package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);
    }
}
