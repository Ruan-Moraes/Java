package edu.loiane.cursojavabasico.exc.aula24;

public class AgendaCelular {
    String nome;
    String email;
    String[] telefones;

    public AgendaCelular(String nome, String email, String[] telefones) {
        this.nome = nome;
        this.email = email;

        this.telefones = telefones;
    }

    public void mostarTelefones() {
        for (String telefone : telefones) {
            System.out.println(telefone);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getTelefones() {
        return telefones;
    }

    public void setTelefones(String[] telefones) {
        this.telefones = telefones;
    }
}
