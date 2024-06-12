package edu.loina.cursojavabasico.exc.aula14_15;

public class Exc24 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Informe o que deseja fazer: ");
        System.out.println("1 - Par ou ímpar");
        System.out.println("2 - Positivo ou negativo");
        System.out.println("3 - Inteiro ou decimal");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                if (num1 % 2 == 0) {
                    System.out.println("O número " + num1 + " é par.");
                } else {
                    System.out.println("O número " + num1 + " é ímpar.");
                }

                if (num2 % 2 == 0) {
                    System.out.println("O número " + num2 + " é par.");
                } else {
                    System.out.println("O número " + num2 + " é ímpar.");
                }
                break;
            case 2:
                if (num1 >= 0) {
                    System.out.println("O número " + num1 + " é positivo.");
                } else {
                    System.out.println("O número " + num1 + " é negativo.");
                }

                if (num2 >= 0) {
                    System.out.println("O número " + num2 + " é positivo.");
                } else {
                    System.out.println("O número " + num2 + " é negativo.");
                }
                break;
            case 3:
                if (num1 % 1 == 0) {
                    System.out.println("O número " + num1 + " é inteiro.");
                } else {
                    System.out.println("O número " + num1 + " é decimal.");
                }

                if (num2 % 1 == 0) {
                    System.out.println("O número " + num2 + " é inteiro.");
                } else {
                    System.out.println("O número " + num2 + " é decimal.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
