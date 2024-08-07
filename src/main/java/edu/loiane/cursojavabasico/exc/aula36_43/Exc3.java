package edu.loiane.cursojavabasico.exc.aula36_43;

public class Exc3 {
    public static void main(String[] args) {
        System.out.println("Zoologico");

        Mamifero camelo = new Mamifero("Camelo", 150, "Amarelo", "Terra", 2, "Plantas");
        Urso urso = new Urso("Urso-do-Canada", 180, "Vermelho", "Terra", 0.5, "Mel");
        Peixe tubarao = new Peixe("Tubarao", 300, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");

        System.out.println(camelo);
        System.out.println(urso);
        System.out.println(tubarao);
    }
}
