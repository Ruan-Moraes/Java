package edu.nelioalves.curso.exercicios.excs11.exc2;

import java.util.Locale;
import java.util.Scanner;

public class Exc2 {
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        TaxPayer[] taxPayers = new TaxPayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                taxPayers[i] = new Individual(name, anualIncome, healthExpenditures);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                taxPayers[i] = new Company(name, anualIncome, numberOfEmployees);
            }
        }

        System.out.println("\nTAXES PAID:");

        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer);
        }
    }
}
