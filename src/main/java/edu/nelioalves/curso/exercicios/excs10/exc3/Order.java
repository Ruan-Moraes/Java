package edu.nelioalves.curso.exercicios.excs10.exc3;

import java.util.Date;
import java.util.LinkedList;

public class Order {
    private Date moment;
    private OrderStatus status;
    private LinkedList<OrderItem> items = new LinkedList<>();

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public double total() {
        double total = 0.0;

        for (OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
    }

    public LinkedList<OrderItem> getItems() {
        return items;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
