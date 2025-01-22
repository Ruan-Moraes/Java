package edu.nelioalves.curso.exercicios.excs15.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class VoteCounter {
    public static void calculeVotes(String filePath) {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(filePath))) {
            String line = buffRead.readLine();

            Map<String, Integer> candidates = new HashMap<>();

            while (line != null) {
                String[] fields = line.split(",");

                String candidate = fields[0];
                int votes = Integer.parseInt(fields[1]);

                if (candidates.containsKey(candidate)) {
                    candidates.put(candidate, candidates.get(candidate) + votes);
                } else {
                    candidates.put(candidate, votes);
                }

                line = buffRead.readLine();
            }

            for (String candidate : candidates.keySet()) {
                System.out.println(candidate + ": " + candidates.get(candidate));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
