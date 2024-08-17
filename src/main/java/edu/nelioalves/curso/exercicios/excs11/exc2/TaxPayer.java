package edu.nelioalves.curso.exercicios.excs11.exc2;

public class TaxPayer {
    private String name;
    private Double anualIncome;

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public Double tax() {
        if (anualIncome < 20000.0) {
            return anualIncome * 0.15;
        } else {
            return anualIncome * 0.25;
        }
    }

    @Override
    public String toString() {
        return name + ": $ " + String.format("%.2f", tax());
    }

    public String getName() {
        return name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
