package edu.nelioalves.curso.exercicios.excs5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> divisores = new ArrayList<>();

        System.out.println("Entre com o número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores.add(i);
            }
        }

        System.out.println("Divisores de " + n + ": " + divisores);
    }
}
