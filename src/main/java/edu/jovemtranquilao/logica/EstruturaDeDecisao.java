package edu.jovemtranquilao.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        numeroPar();
        stringComparacao();
        stringInicia();
        datas();
    }

    private static void numeroPar() {
        int numero = 2;

        if (numero % 2 == 0) {
            // Executo codigo daqui verdadeiro
            System.out.println("Par");
        } else {
            // Executo codigo quando falso
            System.out.println("ímpar");
        }
    }

    private static void stringComparacao() {
        String frase = "Hoje é quarta";

        if (frase.contains("segunda")) {
            // Executo codigo daqui verdadeiro
            if (frase.contains("seis da tarde")) {
                System.out.println("Um pouco mais feliz!");
            } else {
                System.out.println("Tristeza");
            }
        } else if (frase.contains("sexta") || frase.contains("sábado") || frase.contains("domingo")) {
            // Executo codigo quando falso
            System.out.println("Alergia");
        } else {
            // Executo codigo quando falso
            System.out.println("Tristeza");
        }
    }

    public static void stringInicia() {
        String palavra = "alergia";

        if (palavra.startsWith("A")) {
            System.out.println("Palavra inicia com [a].");
        } else {
            System.out.println("Palavra não inicia com [a].");
        }
    }

    public static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("21/05/2034");

        if (!data.before(new Date())) {
            System.out.println("Esse dia já passou");
        } else {
            System.out.println("Esse dia não chegou");
        }
    }
}
