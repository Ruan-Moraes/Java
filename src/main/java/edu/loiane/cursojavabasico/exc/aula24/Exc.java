package edu.loiane.cursojavabasico.exc.aula24;

public class Exc {
    public static void main(String[] args) {
        AgendaCelular celular = new AgendaCelular("João", "joaozinho@gmail.com", new String[]{"(11) 9999-9999", "(11) 9999-9998"});
        celular.mostarTelefones();

        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96, 1943);


    }
}
