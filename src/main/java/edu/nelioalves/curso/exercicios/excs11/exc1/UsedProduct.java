package edu.nelioalves.curso.exercicios.excs11.exc1;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);

        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), manufactureDate);
    }

    public Double totalPrice() {
        return getPrice();
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
