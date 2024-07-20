package edu.loiane.cursojavabasico.exc.aula11_12_13;

import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho (m²) da área a ser pintada: ");
        double area = scanner.nextDouble();

        double litros = area / 3;
        double latas = litros / 18;
        double preco = latas * 80;

        System.out.println("Litros: " + litros);
        System.out.println("Latas: " + latas);
        System.out.println("Preço: " + preco);
    }
}
