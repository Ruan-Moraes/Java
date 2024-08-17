package main.java.edu.nelioalves.introducao_a_linguagem_java.exercicios.excs7;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número da conta:");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Entre com o titular da conta:");
        String accountHolder = scanner.nextLine();

        System.out.println("Haverá depósito inicial (s/n)?");
        boolean initialDeposit = scanner.nextLine().charAt(0) == 's';

        Account account;

        if (initialDeposit) {
            System.out.println("Entre com o valor do depósito inicial:");
            double initialDepositValue = scanner.nextDouble();

            account = new Account(accountNumber, accountHolder, initialDepositValue);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println();

        System.out.println("Dados da conta:");
        System.out.println(account);

        System.out.println();

        System.out.println("Entre com um valor para depósito:");
        account.depositar(scanner.nextDouble());

        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        System.out.println();

        System.out.println("Entre com um valor para saque:");
        account.sacar(scanner.nextDouble());

        System.out.println("Dados da conta atualizados:");
        System.out.println(account);

        scanner.close();
    }
}
