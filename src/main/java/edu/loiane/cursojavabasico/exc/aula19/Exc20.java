package edu.loiane.cursojavabasico.exc.aula19;

public class Exc20 {
    public static void main(String[] args) {
        double cotancaoDolar = 5.25;

        double[] valoresConvertido = new double[20];

        for (int i = 0; i < valoresConvertido.length; i++) {
            valoresConvertido[i] = cotancaoDolar * (i + 1);

            System.out.println((i + 1) + " - R$ " + valoresConvertido[i]);
        }
    }
}
