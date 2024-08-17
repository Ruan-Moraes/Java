package edu.loiane.curso.exc.aula36;

import java.util.Arrays;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Contato getContato(int pos) {
        if ((pos >= 0) && (pos < contatos.length)) {
            return contatos[pos];
        }

        return null;
    }

    public Contato[] getAllContatos() {
        return contatos;
    }

    public Agenda(String nome, Contato[] contatos) {
        this.nome = nome;
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", contatos=" + Arrays.toString(contatos) +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
}
