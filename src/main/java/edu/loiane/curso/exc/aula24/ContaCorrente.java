package edu.loiane.curso.exc.aula24;

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

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", especial=" + especial +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}
