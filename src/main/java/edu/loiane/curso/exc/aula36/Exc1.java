package edu.loiane.curso.exc.aula36;

import java.util.Arrays;

public class Exc1 {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Contato1", "123456", "Contato1@email.com");
        Contato contato2 = new Contato("Contato2", "123456", "Contato2@email.com");
        Contato contato3 = new Contato("Contato3", "123456", "Contato3@email.com");

        Agenda minhaAgenda = new Agenda("minhaAgenda", new Contato[]{contato1, contato2, contato3});

        System.out.println(Arrays.toString(minhaAgenda.getAllContatos()));

        System.out.println(minhaAgenda.getContato(1));
    }
}
