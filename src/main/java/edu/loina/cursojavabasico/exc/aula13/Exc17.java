package edu.loina.cursojavabasico.exc.aula13;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho (m²) da área a ser pintada: ");
        double area = scanner.nextDouble();

        double litros = area / 6;

        double latas = Math.ceil(litros / 18);
        double precoLatas = latas * 80;

        double galoes = Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25;

        double misturaLatas = Math.floor(litros / 18);
        double misturaGaloes = Math.ceil((litros % 18) / 3.6);
        double precoMistura = (misturaLatas * 80) + (misturaGaloes * 25);

        System.out.println("Litros: " + litros);

        System.out.println("Latas: " + latas);
        System.out.println("Preço (Latas): " + precoLatas);

        System.out.println("Galões: " + galoes);
        System.out.println("Preço (Galões): " + precoGaloes);

        System.out.println("Latas: " + misturaLatas);
        System.out.println("Galões: " + misturaGaloes);
        System.out.println("Preço (Mistura): " + precoMistura);
    }
}
