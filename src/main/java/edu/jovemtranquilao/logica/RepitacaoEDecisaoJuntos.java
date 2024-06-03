package edu.jovemtranquilao.logica;

import java.util.ArrayList;

public class RepitacaoEDecisaoJuntos {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for (int index = 1; index <= 100; index += 1) {
            listaDeUmADez.add(index);
        }

        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for(Integer number : listaDeUmADez) {
            if(number % 2 == 0) {
                numerosPares.add(number);
                System.out.println("O numero [" + number + "] " + "é par!" );
            } else {
                numerosImpares.add(number);
                System.out.println("O numero [" + number + "] " + "NÃO é par!" );
            }
        }
    }
}
