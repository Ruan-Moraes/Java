package edu.loina.cursojavabasico.exc.aula16_17;

public class Exc16 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo < 500) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }
    }
}
