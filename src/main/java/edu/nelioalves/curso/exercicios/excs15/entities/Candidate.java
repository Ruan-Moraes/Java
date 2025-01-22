package edu.nelioalves.curso.exercicios.excs15.entities;

import java.util.Objects;

public class Candidate {
    public String name;
    public int totalVotes;

    public Candidate(String name) {
        this.name = name;
        this.totalVotes = 0;
    }

    public void addVote(int votes) {
        this.totalVotes += votes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", totalVotes=" + totalVotes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalVotes() {
        return totalVotes;
    }
}
