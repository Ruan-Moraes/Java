package edu.loina.cursojavabasico.exc.aula16_17;

public class Exc14 {
    public static void main(String[] args) {
        int n = 15;
        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        for (int i = 3; i <= n; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.println(proximo);
        }
    }
}
