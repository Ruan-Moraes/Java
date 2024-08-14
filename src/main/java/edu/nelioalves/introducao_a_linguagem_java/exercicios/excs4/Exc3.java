package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs4;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] combustiveis = {"Álcool", "Gasolina", "Diesel"};

        int[] votos = new int[combustiveis.length];

        while (true) {
            System.out.println("Digite o combustível desejado:");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.println("4. Fim");

            int voto = scanner.nextInt();

            if (voto == 4) {
                break;
            }

            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            }
        }

        System.out.println("MUITO OBRIGADO");

        for (int i = 0; i < combustiveis.length; i++) {
            System.out.printf("%s: %d%n", combustiveis[i], votos[i]);
        }
    }
}
