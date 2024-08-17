package edu.loiane.curso.exc.aula20;

import java.util.Scanner;

public class Exc5 {
    public class Exc4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[][][] compromissos = new String[12][31][8];

            boolean continuar = true;

            while (continuar) {
                System.out.println("--------- MENU ---------");
                System.out.println("Digite (1) para cadastrar um novo compromisso.");
                System.out.println("Digite (2) para ver o compromisso agendado no dia.");
                System.out.println("Digite (3) para alterar o dia e hora do compromisso.");
                System.out.println("Digite (4) para sair do programa.");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        while (true) {
                            System.out.print("Entre com o mês (1-12): ");
                            int mes = scanner.nextInt();

                            System.out.print("Entre com o dia do mês (1-31): ");
                            int diaMes = scanner.nextInt();

                            System.out.print("Entre com a hora de início (0-7): ");
                            int horaInicio = scanner.nextInt();

                            System.out.print("Entre com a hora de término (0-7): ");
                            int horaTermino = scanner.nextInt();

                            scanner.nextLine();

                            if (horaInicio > horaTermino) {
                                System.out.println("Hora de início maior que hora de término!");
                                continue;
                            }

                            if (compromissos[mes - 1][diaMes - 1][horaInicio] == null) {
                                System.out.println("Entre com o compromisso: ");
                                String compromisso = scanner.nextLine();

                                for (int i = horaInicio; i <= horaTermino; i++) {
                                    compromissos[mes - 1][diaMes - 1][i] = compromisso;
                                }

                                System.out.println("Compromisso inserido com sucesso!");

                                break;
                            } else {
                                System.out.println("Horário ocupado! Tente em outro dia ou hora.");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Entre com o mês (1-12): ");
                        int mes = scanner.nextInt();

                        System.out.print("Entre com o dia que deseja observar (1-31): ");
                        int diaMes = scanner.nextInt();

                        System.out.print("Deseja filtrar por hora (S / N): ");
                        String filtrarHora = scanner.next();

                        if (filtrarHora.equalsIgnoreCase("S")) {
                            System.out.print("Informe a hora do compromisso (0-7): ");
                            int horaCompromisso = scanner.nextInt();

                            String compromisso = compromissos[mes - 1][diaMes - 1][horaCompromisso];

                            if (compromisso != null) {
                                System.out.println("No dia " + diaMes + " do mês " + mes + " às " + horaCompromisso + " horas, você tem: " + compromisso);
                            } else {
                                System.out.println("Nenhum compromisso agendado neste horário.");
                            }
                        } else {
                            System.out.println("No dia " + diaMes + " do mês " + mes + ", você tem esses compromissos:");

                            for (int i = 0; i < compromissos[mes - 1][diaMes - 1].length; i++) {
                                if (compromissos[mes - 1][diaMes - 1][i] != null) {
                                    System.out.println("Hora (" + i + ") - Compromisso: " + compromissos[mes - 1][diaMes - 1][i]);
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Entre com o mês (1-12): ");
                        mes = scanner.nextInt();

                        System.out.print("Entre com o dia do mês (1-31): ");
                        diaMes = scanner.nextInt();

                        System.out.print("Entre com a hora de início (0-7): ");
                        int horaInicio = scanner.nextInt();

                        System.out.print("Entre com a hora de término (0-7): ");
                        int horaTermino = scanner.nextInt();

                        scanner.nextLine();

                        if (horaInicio > horaTermino) {
                            System.out.println("Hora de início maior que hora de término!");

                            continue;
                        }

                        if (compromissos[mes - 1][diaMes - 1][horaInicio] != null) {
                            System.out.println("Entre com o novo compromisso: ");
                            String compromisso = scanner.nextLine();

                            for (int i = horaInicio; i <= horaTermino; i++) {
                                compromissos[mes - 1][diaMes - 1][i] = compromisso;
                            }

                            System.out.println("Compromisso alterado com sucesso!");
                        } else {
                            System.out.println("Horário não está ocupado!");
                        }
                        break;
                    case 4:
                        continuar = false;

                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");

                        break;
                }
            }
        }
    }
}
