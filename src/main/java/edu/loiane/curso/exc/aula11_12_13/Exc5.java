package edu.loiane.curso.exc.aula11_12_13;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");
    }
}
