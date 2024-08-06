package edu.loiane.cursojavabasico.exc.aula24;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;

    @Override
    public String toString() {
        return "Lampada {" +
                "modelo='" + modelo + '\'' +
                ", tensao='" + tensao + '\'' +
                ", potencia=" + potencia +
                ", cor='" + cor + '\'' +
                ", tipoLuz='" + tipoLuz + '\'' +
                '}';
    }
}
