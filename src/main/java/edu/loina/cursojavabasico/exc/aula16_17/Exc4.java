package edu.loina.cursojavabasico.exc.aula16_17;

public class Exc4 {
    public static void main(String[] args) {
        int populacaoPaisA = 80000;
        int populacaoPaisB = 200000;

        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;

        int anos = 0;

        while (populacaoPaisA < populacaoPaisB) {
            populacaoPaisA += populacaoPaisA * taxaCrescimentoA;
            populacaoPaisB += populacaoPaisB * taxaCrescimentoB;

            anos++;
        }

        System.out.println("População A: " + populacaoPaisA);
        System.out.println("População B: " + populacaoPaisB);

        System.out.println("Até o ano " + anos + " a população do país A será maior que a população do país B.");
    }
}
