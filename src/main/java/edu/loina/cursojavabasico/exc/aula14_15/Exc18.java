package edu.loina.cursojavabasico.exc.aula14_15;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um data(dd/mm/aaaa): ");
        String data = scanner.next();

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(data);

        if (matcher.matches()) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }
    }
}
