package edu.loiane.curso.exc.aula36_43;

public class PessoaJuridica extends Contribuinte {
    private double imposto = 0.1;

    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);

        this.imposto = calcularImposto(rendaBruta, imposto);

        super.setRendaLiquida(rendaBruta - this.imposto);
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "imposto=" + imposto +
                "} " + super.toString();
    }
}