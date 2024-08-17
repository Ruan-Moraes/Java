package edu.loiane.curso.exc.aula36_43;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public void sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);

        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "} " + super.toString();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
