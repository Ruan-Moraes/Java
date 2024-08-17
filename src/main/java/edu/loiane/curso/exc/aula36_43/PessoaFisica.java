package edu.loiane.curso.exc.aula36_43;

public class PessoaFisica extends Contribuinte {
    private double imposto;

    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);

        this.imposto = calcularImposto(rendaBruta);

        super.setRendaLiquida(rendaBruta - this.imposto);
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "imposto=" + imposto +
                "} " + super.toString();
    }
}
