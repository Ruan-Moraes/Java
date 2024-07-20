package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
    }
}
