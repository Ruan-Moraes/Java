package edu.nelioalves.curso.exercicios.excs15;

import edu.nelioalves.curso.exercicios.excs15.utils.VoteCounter;

public class Exc2 {
    public static void main(String[] args) {
        VoteCounter.calculeVotes(System.getProperty("user.dir") + "/src/main/java/edu/nelioalves/curso/exercicios/excs15/files/votes.csv");
    }
}
