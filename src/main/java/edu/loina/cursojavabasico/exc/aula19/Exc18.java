package edu.loina.cursojavabasico.exc.aula19;

public class Exc18 {
    public static void main(String[] args) {
        int[] idadesDePessoas = new int[10];

        for (int i = 0; i < idadesDePessoas.length; i++) {
            idadesDePessoas[i] = (int) Math.round(Math.random() * 100);
        }

        int[] menorIdade = new int[2];
        int[] maiorIdade = new int[2];

        for (int i = 0; i < idadesDePessoas.length; i++) {
            if (i == 0) {
                menorIdade[0] = idadesDePessoas[i];
                menorIdade[1] = i;
                maiorIdade[0] = idadesDePessoas[i];
                maiorIdade[1] = i;
            } else {
                if (idadesDePessoas[i] < menorIdade[0]) {
                    menorIdade[0] = idadesDePessoas[i];
                    menorIdade[1] = i;
                } else if (idadesDePessoas[i] > maiorIdade[0]) {
                    maiorIdade[0] = idadesDePessoas[i];
                    maiorIdade[1] = i;
                }
            }
        }

        System.out.println("Menor idade: " + menorIdade[0] + " (índice: " + menorIdade[1] + ")");
        System.out.println("Maior idade: " + maiorIdade[0] + " (índice: " + maiorIdade[1] + ")");
    }
}
