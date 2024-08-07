package edu.loiane.cursojavabasico.exc.aula36_43;

public class Exc1 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos", "123456", 1000, 10);
        ContaEspecial contaEspecial = new ContaEspecial("Ruan", "654321", 1000, 2000);

        System.out.println(contaPoupanca);
        System.out.println(contaEspecial);

        System.out.println();

        contaPoupanca.calcularNovoSaldo(0.1);
        contaEspecial.sacar(1500);

        System.out.println(contaPoupanca);
        System.out.println(contaEspecial);

        System.out.println();

        contaPoupanca.depositar(500);
        contaEspecial.depositar(250);

        System.out.println(contaPoupanca);
        System.out.println(contaEspecial);

        System.out.println();

        contaEspecial.sacar(1500);

        System.out.println(contaEspecial);

        System.out.println();

        contaPoupanca.calcularNovoSaldo(-0.2);

        System.out.println(contaPoupanca);
    }
}