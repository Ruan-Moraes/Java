package edu.loiane.cursojavabasico.exc.aula34;

public class ConversaoDeUnidadesDeVolume {
    public static double litrosParaCentimetrosCubicos(double litros) {
        return litros * 1000;
    }

    public static double metrosCubicosParaLitros(double metrosCubicos) {
        return metrosCubicos * 1000;
    }

    public static double metrosCubicosParaPesCubicos(double metrosCubicos) {
        return metrosCubicos * 35.32;
    }

    public static double galoesParaPolegadasCubicas(double galoes) {
        return galoes * 231;
    }

    public static double galoesParaLitros(double galoes) {
        return galoes * 3.785;
    }
}
