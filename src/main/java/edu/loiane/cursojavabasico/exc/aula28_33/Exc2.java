package edu.loiane.cursojavabasico.exc.aula28_33;

public class Exc2 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("123456", "1234", true, 1000, 500);

        System.out.println(conta);

        conta.depositar(500);
        conta.consultarSaldo();

        conta.realizarSaque(1000);
        conta.consultarSaldo();

        conta.realizarSaque(1000);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
