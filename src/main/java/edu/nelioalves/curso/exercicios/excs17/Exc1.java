package edu.nelioalves.curso.exercicios.excs17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        Map<String, ArrayList> employees = new HashMap<>();

        String fullPath = System.getProperty("user.dir") + "/src/main/java/edu/nelioalves/curso/exercicios/excs17/" + path;


        try (BufferedReader file = new BufferedReader(new FileReader(fullPath))) {
            String line = file.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String name = fields[0];
                String email = fields[1];
                double salary = Double.parseDouble(fields[2]);

                ArrayList<Object> data = new ArrayList<>() {{
                    add(email);
                    add(salary);
                }};

                employees.put(name, data);

                line = file.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("enter the cut-off salary amount:");
        double cutOff = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + cutOff + ":");

        employees.entrySet().stream()
                .filter(e -> (double) e.getValue().get(1) > cutOff)
                .sorted(Comparator.comparing(e -> e.getKey().toUpperCase()))
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue().getFirst()));

        double sum = employees.entrySet().stream()
                .filter(e -> e.getKey().toUpperCase().startsWith("M"))
                .map(e -> (double) e.getValue().get(1))
                .reduce(0.0, (x, y) -> x + y);

        System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

        sc.close();
    }
}
