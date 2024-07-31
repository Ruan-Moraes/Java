package edu.loiane.cursojavabasico.exc.aula24;

public class ContaCorrente {
    String numero;
    String agencia;
    double saldo;
    boolean especial;

    public ContaCorrente(String numero, String agencia, double saldo, boolean especial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
    }
}
