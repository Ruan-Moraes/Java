package edu.nelioalves.curso.exercicios.excs11.exc1;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);

        this.customsFee = customsFee;
    }

    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", getName(), totalPrice(), customsFee);
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}
