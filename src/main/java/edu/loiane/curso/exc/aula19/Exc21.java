package edu.loiane.curso.exc.aula19;

public class Exc21 {
    public static void main(String[] args) {
        double cotancaoDolar = 5.25;

        double[] valoresConvertido = new double[20];

        for (int i = 0; i < valoresConvertido.length; i++) {
            valoresConvertido[i] = cotancaoDolar * (i + Math.random() * 10);

            System.out.println((i + 1) + " - R$ " + valoresConvertido[i]);
        }
    }
}
