package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o graus em Farenheit");
        double temperaturaFarenheit = scan.nextDouble();

        double temperaturaCelsius = 5 * (temperaturaFarenheit - 32) / 9;

        System.out.println("A tempatura " + temperaturaFarenheit + "F " + "é" + temperaturaCelsius + " em Celsius.");
    }
}
