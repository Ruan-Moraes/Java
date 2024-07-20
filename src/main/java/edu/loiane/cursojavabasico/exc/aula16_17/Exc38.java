package edu.loiane.cursojavabasico.exc.aula16_17;

public class Exc38 {
    public static void main(String[] args) {
        double salario = 1000;
        double percentual = 1.5;

        for (int i = 1996; i <= 2021; i++) {
            salario += (salario / 100) * percentual;

            percentual *= 2;
        }

        System.out.println("Salário atual: " + salario);
    }
}
