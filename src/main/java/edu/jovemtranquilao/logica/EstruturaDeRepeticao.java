package edu.jovemtranquilao.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        // listaDePalavras();
        // forClassico();
        // forPuro();
        stringInvertida();
    }

    private static void listaDePalavras() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Ruan");
        palavrasList.add("Carlos");
        palavrasList.add("Ana");
        palavrasList.add("Evelyn");

        for (String palavra : palavrasList) {
            System.out.println(palavra);
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));
    }

    private static void forClassico() {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Ruan");
        palavrasList.add("Carlos");
        palavrasList.add("Ana");
        palavrasList.add("Evelyn");

        for (int i = 0; i < palavrasList.size(); i++) {
            System.out.println(palavrasList.get(i));
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));
    }

    private static void forPuro() {
        for (int index = 0; index <= 10; index++) {
            System.out.println(index);
        }
    }

    private static void stringInvertida() {
        String normal = "Ruan Moraes";
        String invertida = "";

        for(int index = normal.length() - 1; index >= 0; index--) {
            invertida = invertida + normal.charAt(index);
        }

        System.out.println(invertida);
    }
}
