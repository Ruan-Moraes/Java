package edu.loiane.cursojavabasico.exc.aula36_43;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;
    private double rendaLiquida;

    protected Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    protected double calcularImposto(double rendaBruta, double imposto) {
        return rendaBruta * imposto;
    }

    protected double calcularImposto(double rendaBruta) {
        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta <= 2100) {
            return rendaBruta * 0.1 - 100;
        } else if (rendaBruta <= 2800) {
            return rendaBruta * 0.15 - 270;
        } else if (rendaBruta <= 3600) {
            return rendaBruta * 0.25 - 500;
        } else {
            return rendaBruta * 0.3 - 700;
        }
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", rendaBruta=" + rendaBruta +
                ", rendaLiquida=" + rendaLiquida +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getRendaLiquida() {
        return rendaLiquida;
    }

    public void setRendaLiquida(double rendaLiquida) {
        this.rendaLiquida = rendaLiquida;
    }
}
