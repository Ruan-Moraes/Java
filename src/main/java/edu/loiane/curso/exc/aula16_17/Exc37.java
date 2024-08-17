package edu.loiane.curso.exc.aula16_17;

import java.util.Scanner;

public class Exc37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double altura, peso;
        double alturaMaisAlta = 0, alturaMaisBaixa = Double.MAX_VALUE, pesoMaisGordo = 0, pesoMaisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int quantidadeClientes = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para sair): ");
            codigo = scanner.nextInt();
            if (codigo == 0) break;

            System.out.print("Digite a altura do cliente (em metros): ");
            altura = scanner.nextDouble();
            System.out.print("Digite o peso do cliente (em kg): ");
            peso = scanner.nextDouble();

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                codigoMaisAlto = codigo;
            }

            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                codigoMaisBaixo = codigo;
            }

            if (peso > pesoMaisGordo) {
                pesoMaisGordo = peso;
                codigoMaisGordo = codigo;
            }

            if (peso < pesoMaisMagro) {
                pesoMaisMagro = peso;
                codigoMaisMagro = codigo;
            }

            somaAlturas += altura;
            somaPesos += peso;
            quantidadeClientes++;
        }

        if (quantidadeClientes > 0) {
            double mediaAlturas = somaAlturas / quantidadeClientes;
            double mediaPesos = somaPesos / quantidadeClientes;

            System.out.println("Cliente mais alto: Código " + codigoMaisAlto + ", Altura: " + alturaMaisAlta + " metros");
            System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + ", Altura: " + alturaMaisBaixa + " metros");
            System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + ", Peso: " + pesoMaisGordo + " kg");
            System.out.println("Cliente mais magro: Código " + codigoMaisMagro + ", Peso: " + pesoMaisMagro + " kg");
            System.out.println("Média das alturas: " + mediaAlturas + " metros");
            System.out.println("Média dos pesos: " + mediaPesos + " kg");
        } else {
            System.out.println("Nenhum cliente foi registrado.");
        }
    }

}

