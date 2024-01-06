package com.youtube.jovemtranquilao.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ArrayList<String> palavrasList = new ArrayList<>();

        palavrasList.add("Ruan");
        palavrasList.add("Carlos");
        palavrasList.add("Ana");
        palavrasList.add("Evelyn");

        for(String palavra : palavrasList) {
            System.out.println(palavra);
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));
    }
}
