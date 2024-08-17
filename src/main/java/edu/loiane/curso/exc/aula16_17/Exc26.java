package edu.loiane.curso.exc.aula16_17;

public class Exc26 {
    public static void main(String[] args) {
        String[] candidatos = {"Candidato 1", "Candidato 2", "Candidato 3"};

        for (int i = 0; i < candidatos.length; i++) {
            int numerosVotos = (int) (Math.random() * 100000);

            System.out.println("O candidato " + candidatos[i] + " recebeu " + numerosVotos + " votos");
        }
    }
}
