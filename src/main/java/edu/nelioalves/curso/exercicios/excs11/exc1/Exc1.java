package edu.nelioalves.curso.exercicios.excs11.exc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Exc1 {
    static private Scanner scanner = new Scanner(System.in);
    static private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        System.out.println("Enter the number of products:");
        int n = scanner.nextInt();

        LinkedList<Product> products = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = scanner.next().charAt(0);

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();


            switch (type) {
                case 'c':
                    products.add(new Product(name, price));

                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date manufactureDate = sdf.parse(scanner.next());

                    products.add(new UsedProduct(name, price, manufactureDate));

                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = scanner.nextDouble();

                    products.add(new ImportedProduct(name, price, customsFee));
                    break;
            }
        }

        System.out.println("PRICE TAGS:");

        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}
