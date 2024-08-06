package edu.loiane.cursojavabasico.exc.aula24;

public class Exc1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";

        System.out.println(lampada);
    }
}
