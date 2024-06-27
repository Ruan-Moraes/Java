package edu.loina.cursojavabasico.exc.aula16_17;


import java.util.Scanner;

public class Exc32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número que deseja saber o fatorial: ");
        int numero = scanner.nextInt();

        int numeroImprimir = numero;
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;


            if (i == 1) {
                System.out.println("Fatorial de: " + numero);

                System.out.print(numero + "! = ");
            }

            if (i != numero) {
                System.out.print(numeroImprimir + " . ");
            } else {
                System.out.print(numeroImprimir + " = " + fatorial);
            }

            numeroImprimir -= 1;
        }


    }
}
