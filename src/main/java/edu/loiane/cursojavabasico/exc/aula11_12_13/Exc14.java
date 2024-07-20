package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pesoMaximo = 50;
        double multaPorQuilo = 4;

        System.out.println("Informe o peso dos peixes: ");
        double pesoPeixes = scan.nextDouble();

        if (pesoPeixes > pesoMaximo) {
            double excesso = pesoPeixes - pesoMaximo;
            double multa = excesso * multaPorQuilo;

            System.out.println("Pescador excedeu " + excesso + "kg");
            System.out.println("Multa de R$ " + multa);
        }

        if (pesoPeixes <= pesoMaximo) {
            System.out.println("Peso dentro do permitido.");
        }
    }
}
