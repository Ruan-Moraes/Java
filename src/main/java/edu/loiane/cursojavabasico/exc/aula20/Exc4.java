package edu.loiane.cursojavabasico.exc.aula20;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) throws Error {
        Scanner scanner = new Scanner(System.in);

        String[][] compromissos = new String[31][24];

        boolean continuar = true;

        while (continuar) {
            System.out.println("--------- MENU ---------");
            System.out.println("Digite (1) para cadastrar um novo compromisso.");
            System.out.println("Digite (2) para ver o compromisso agendado no dia. ");
            System.out.println("Digite (3) para alterar o dia e hora do compromisso.");
            System.out.println("Digite (4) para sair do programa.");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    while (true) {
                        System.out.print("Entre com o dia do mês: (1-31): ");
                        int diaMes = scanner.nextInt();

                        System.out.print("Entre com a hora de início: (0-23): ");
                        int horaInicio = scanner.nextInt();

                        if (diaMes != 0) {
                            diaMes -= 1;
                        }

                        System.out.print("Entre com a hora de término: (0-23): ");
                        int horaTermino = scanner.nextInt();

                        if (horaInicio > horaTermino) {
                            System.out.println("Hora de início maior que hora de término!");

                            continue;
                        }

                        if (compromissos[diaMes][horaInicio] == null) {
                            System.out.println("Entre com o compromisso: ");
                            String compromisso = scanner.next();

                            for (int i = horaInicio; i <= horaTermino; i++) {
                                compromissos[diaMes][i] = compromisso;
                            }

                            break;
                        } else {
                            System.out.println("Horário ocupado! Tente em outro dia ou hora.");
                        }
                    }

                    break;
                case 2:
                    System.out.print("Entre com o dia que deseja observar: ");
                    int diaMes = scanner.nextInt();

                    if (diaMes != 0) {
                        diaMes -= 1;
                    }

                    System.out.print("Desejar filtar por hora (S / N): ");
                    String filtarHora = scanner.next();

                    if (filtarHora.equalsIgnoreCase("Sim") || filtarHora.equalsIgnoreCase("S")) {
                        System.out.print("Informe a hora do compromisso (0-23): ");
                        int horaCompromisso = scanner.nextInt();

                        String compromisso = compromissos[diaMes][horaCompromisso];

                        System.out.println("     No dia " + diaMes + ", você tem esses compromissos     ");
                        System.out.println("----------------------------------------------------");

                        for (int i = 0; i < compromissos[diaMes].length; i++) {
                            if (compromissos[diaMes][i] == null) {
                                continue;
                            }

                            if (compromissos[diaMes][i].equalsIgnoreCase(compromisso)) {
                                System.out.println("Na hora " + i + ", você tem esse compromisso: " + compromisso);
                            }
                        }
                    } else {
                        System.out.println("No dia " + diaMes + ", você tem esses compromissos: ");

                        for (int i = 0; i < compromissos[diaMes].length; i++) {
                            if (compromissos[diaMes][i] != null) {
                                System.out.println("Hora (" + i + ") - Compromisso(s): " + compromissos[diaMes][i]);
                            }
                        }
                    }

                    break;
                case 3:
                    // Alterar compromisso

                    System.out.print("Entre com o dia do mês: (1-31): ");
                    diaMes = scanner.nextInt();

                    if (diaMes != 0) {
                        diaMes -= 1;
                    }

                    System.out.print("Entre com a hora de início: (0-23): ");
                    int horaInicio = scanner.nextInt();

                    System.out.print("Entre com a hora de término: (0-23): ");
                    int horaTermino = scanner.nextInt();

                    if (horaInicio > horaTermino) {
                        System.out.println("Hora de início maior que hora de término!");

                        continue;
                    }
                    
                    if (compromissos[diaMes][horaInicio] != null) {
                        System.out.println("Entre com o compromisso: ");
                        String compromisso = scanner.next();

                        for (int i = horaInicio; i <= horaTermino; i++) {
                            compromissos[diaMes][i] = compromisso;
                        }
                    } else {
                        System.out.println("Horário não está ocupado!");
                    }

                    break;
                case 4:
                    continuar = false;

                    break;
            }
        }
    }
}