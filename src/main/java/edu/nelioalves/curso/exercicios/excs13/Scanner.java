package edu.nelioalves.curso.exercicios.excs13;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();

        String homePath = System.getProperty("user.home");
        String inputPath = homePath + "/Documentos/myProjects/Java/src/main/java/edu/nelioalves/curso/exercicios/excs13/input/input.csv";

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(inputPath))) {
            String line = null;

            do {
                line = br.readLine();

                if (line != null) {
                    list.add(line);
                }
            } while (line != null);

            List<String[]> summary = list.stream().map(s -> {
                String[] fields = s.split(",");

                float totalValue = Float.parseFloat(fields[1]) * Float.parseFloat(fields[2]);

                return new String[]{fields[0], String.format("%.2f", totalValue)};
            }).toList();

            String outputFolder = homePath + "/Documentos/myProjects/Java/src/main/java/edu/nelioalves/curso/exercicios/excs13/output";

            boolean success = new File(outputFolder).mkdir();

            if (success) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Directory already exists");
            }

            String outputPath = outputFolder + "/summary.csv";

            try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(outputPath))) {
                for (String[] arr : summary) {
                    bw.write(arr[0] + "," + arr[1]);

                    bw.newLine();
                }
            } catch (Exception e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
