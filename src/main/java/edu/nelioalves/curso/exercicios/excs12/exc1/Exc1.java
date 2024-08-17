package edu.nelioalves.curso.exercicios.excs12.exc1;

import edu.nelioalves.curso.exercicios.excs12.exc1.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        Integer number = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Holder: ");
        String holder = scanner.nextLine();

        System.out.print("Initial balance: ");
        Double balance = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        Double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);

            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (RuntimeException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
