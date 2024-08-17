package edu.loiane.curso.exc.aula28_33;

public class Exc1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada("A60", "Bivolt", 7, "Branca", false);

        System.out.println(lampada);
        lampada.ligar();

        System.out.println(lampada);
        lampada.desligar();

        System.out.println(lampada);
    }
}
