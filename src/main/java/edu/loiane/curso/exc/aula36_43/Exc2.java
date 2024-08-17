package edu.loiane.curso.exc.aula36_43;

public class Exc2 {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Pessoa Física", 1000);
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Pessoa Jurídica", 1000);

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);

        pessoaFisica = new PessoaFisica("Pessoa Física", 1500);
        pessoaJuridica = new PessoaJuridica("Pessoa Jurídica", 1500);

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);

        pessoaFisica = new PessoaFisica("Pessoa Física", 2000);
        pessoaJuridica = new PessoaJuridica("Pessoa Jurídica", 2000);

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
    }
}
