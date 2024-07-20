package edu.loiane.cursojavabasico.exc.aula16_17;

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String nomeUsuario = scanner.next();

        if (nomeUsuario.length() < 3) {
            System.out.println("Nome de usuário deve ter no mínimo 3 caracteres.");
        }

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        if (idade < 0 || idade > 150) {
            System.out.println("Idade deve ser entre 0 e 150 anos.");
        }

        System.out.println("Informe seu salário:");
        double salario = scanner.nextDouble();

        if (salario < 0) {
            System.out.println("Salário deve ser maior que 0.");
        }

        System.out.println("Informe seu sexo (F ou M):");
        String sexo = scanner.next();

        if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
            System.out.println("Sexo deve ser F ou M.");
        }

        System.out.println("Informe seu estado civil (S, C, V, D):");
        String estadoCivil = scanner.next();

        if (!estadoCivil.equalsIgnoreCase("S") && !estadoCivil.equalsIgnoreCase("C") && !estadoCivil.equalsIgnoreCase("V") && !estadoCivil.equalsIgnoreCase("D")) {
            System.out.println("Estado civil deve ser S, C, V ou D.");
        }

        System.out.println("Usuário cadastrado com sucesso!");
    }
}
