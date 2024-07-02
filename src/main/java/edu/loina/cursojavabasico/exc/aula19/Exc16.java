package edu.loina.cursojavabasico.exc.aula19;

public class Exc16 {
    public static void main(String[] args) {
        int[] listaA = new int[10];

        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) Math.round(Math.random() * 100);
        }

        int somaDosNumerosInferioresA15 = 0;

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] < 15) {
                somaDosNumerosInferioresA15 += listaA[i];
            }
        }

        int qtyNumerosIgualA15 = 0;

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] == 15) {
                qtyNumerosIgualA15++;
            }
        }

        int mediaDosNumerosSuperioresA15 = 0;

        for (int i = 0; i < listaA.length; i++) {
            if (listaA[i] > 15) {
                mediaDosNumerosSuperioresA15 += listaA[i];
            }
        }

        System.out.println("Soma dos números inferiores a 15: " + somaDosNumerosInferioresA15);
        System.out.println("Quantidade de números iguais a 15: " + qtyNumerosIgualA15);
        System.out.println("Média dos números superiores a 15: " + mediaDosNumerosSuperioresA15 / listaA.length);
    }
}
