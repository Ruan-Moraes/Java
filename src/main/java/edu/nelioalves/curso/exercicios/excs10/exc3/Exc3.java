package edu.nelioalves.curso.exercicios.excs10.exc3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exc3 {
    static private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = scanner.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("How many items to this order? ");
        int items = scanner.nextInt();

        Client client = new Client(name, email, sdf.parse(birthDate));
        Order order = new Order(new Date(), OrderStatus.valueOf(status));

        for (int i = 0; i < items; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            scanner.nextLine();

            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            order.addItem(new OrderItem(productName, quantity, productPrice));
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + sdf.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
        System.out.println("Order items:");

        for (OrderItem item : order.getItems()) {
            System.out.println(item.getName() + ", $" + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + item.subTotal());
        }
    }
}
