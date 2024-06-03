package edu.loina.cursojavabasico.exc.aula13;

import java.util.Scanner;

public class Exc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho total do arquivo (MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Velocidade de download (Mbps): ");
        double velocidadeDownload = scanner.nextDouble();

        double tempoDownload = tamanhoArquivo / velocidadeDownload;

        System.out.println("Tempo de download: " + tempoDownload + " minutos");
    }
}
