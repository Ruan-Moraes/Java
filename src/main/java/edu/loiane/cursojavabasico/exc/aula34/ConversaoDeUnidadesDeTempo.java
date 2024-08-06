package edu.loiane.cursojavabasico.exc.aula34;

public class ConversaoDeUnidadesDeTempo {
    public static double minutoParaSegundo(double minuto) {
        return minuto * 60;
    }

    public static double horaParaMinuto(double hora) {
        return hora * 60;
    }

    public static double diaParaHora(double dia) {
        return dia * 24;
    }

    public static double semanaParaDia(double semana) {
        return semana * 7;
    }

    public static double mesParaDia(double mes) {
        return mes * 30;
    }

    public static double anoParaDia(double ano) {
        return ano * 365.25;
    }
}
