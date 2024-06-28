package edu.loina.cursojavabasico.exc.aula16_17;

public class Exc42 {
    public static void main(String[] args) {
        int[][] listaNumeros = {
                {0, 25},
                {26, 50},
                {51, 75},
                {76, 100}
        };

        for (int[] numeros : listaNumeros) {
            System.out.println("Intervalo: " + numeros[0] + " - " + numeros[1]);

            for (int i = numeros[0]; i <= numeros[1]; i++) {
                System.out.println(i);
            }
        }
    }
}
