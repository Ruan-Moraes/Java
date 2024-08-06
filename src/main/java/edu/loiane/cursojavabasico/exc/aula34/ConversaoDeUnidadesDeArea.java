package edu.loiane.cursojavabasico.exc.aula34;

public class ConversaoDeUnidadesDeArea {
    public static double metroQuadradoParaPesQuadrados(double metroQuadrado) {
        return metroQuadrado * 10.76;
    }

    public static double pesQuadradosParaCentimetrosQuadrados(double pesQuadrados) {
        return pesQuadrados * 929;
    }

    public static double milhasQuadradasParaAcres(double milhasQuadradas) {
        return milhasQuadradas * 640;
    }

    public static double acresParaPesQuadrados(double acres) {
        return acres * 43_560;
    }
}
