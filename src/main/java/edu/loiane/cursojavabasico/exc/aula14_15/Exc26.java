package edu.loiane.cursojavabasico.exc.aula14_15;

public class Exc26 {
    public static void main(String[] args) {
        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double desconto = 0;
        double valorPago = 0;
        double litrosVendidos = 20;
        String tipoCombustivel = "A";

        if (tipoCombustivel.equalsIgnoreCase("A")) {
            if (litrosVendidos <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
            valorPago = litrosVendidos * precoAlcool - (litrosVendidos * precoAlcool * desconto);
        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            if (litrosVendidos <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            valorPago = litrosVendidos * precoGasolina - (litrosVendidos * precoGasolina * desconto);
        }

        System.out.println("Valor a ser pago: " + valorPago);
    }
}
