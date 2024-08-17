package edu.loiane.curso.exc.aula36_43;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public void calcularNovoSaldo(double taxaRendimento) {
        double rendimento = getSaldo() * taxaRendimento;

        depositar(rendimento);
    }

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);

        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento=" + diaRendimento +
                "} " + super.toString();
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
