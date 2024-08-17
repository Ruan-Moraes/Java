package edu.nelioalves.curso.exercicios.excs7;

public class Account {
    private static final double TAXA_SAQUE = 5.0;

    private long numeroConta;
    private String nomeTitular;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor + TAXA_SAQUE;
        }
    }

    public void imprimir() {
        System.out.printf("Conta %d, Titular: %s, Saldo: $ %.2f%n", numeroConta, nomeTitular, saldo);
    }

    public Account(long numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;

        depositar(saldo);
    }

    public Account(long numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numeroConta=" + numeroConta +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public long getNumeroConta() {
        return numeroConta;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
