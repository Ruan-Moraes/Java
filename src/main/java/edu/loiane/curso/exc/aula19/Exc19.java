package edu.loiane.curso.exc.aula19;

public class Exc19 {
    public static void main(String[] args) {
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];

        double[] result = new double[10];

        for (int i = 0; i < nota1.length; i++) {
            nota1[i] = Math.round(Math.random() * 10);
            nota2[i] = Math.round(Math.random() * 10);

            result[i] = (nota1[i] + nota2[i]) / 2;

            String aprovado = result[i] >= 7 ? "Aprovado" : "Reprovado";

            System.out.println("Nota 1: " + nota1[i] + " Nota 2: " + nota2[i] + " Média: " + result[i] + " - " + aprovado);
        }
    }
}
