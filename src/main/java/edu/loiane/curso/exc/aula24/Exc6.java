package edu.loiane.curso.exc.aula24;

public class Exc6 {
    public static void main(String[] args) {
        AgendaCelular celular = new AgendaCelular(
                "João",
                "joazinho@email.com",
                new String[]{"(11) 9999-9999", "(11) 9999-9998, (11) 1299-9797"}
        );

        celular.mostarTelefones();
    }
}
