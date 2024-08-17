package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs6;

public final class CurrencyConverter {
    private static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollarAmount) {
        return dollarPrice * dollarAmount * (1.0 + IOF);
    }
}