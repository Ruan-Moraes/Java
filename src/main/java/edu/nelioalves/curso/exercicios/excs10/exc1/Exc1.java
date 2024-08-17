package edu.nelioalves.curso.exercicios.excs10.exc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exc1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        /*
         *  Argumentos para execução:
         *  "Design" "Alex" "MID_LEVEL" 1200 3 "20/08/2018" 50 20 "13/06/2018" 30 18 "25/08/2018" 80 10 "08/2018"
         * */

        System.out.print("Digite o nome do departamento: ");
        String departmentName = args[0];

        System.out.println("--------------------------------------");
        System.out.println("Digite os dados do trabalhador:");

        System.out.print("Nome: ");
        String workerName = args[1];

        System.out.print("Nível: [JUNIOR, MID_LEVEL, SENIOR]: ");
        String workerLevel = args[2];

        System.out.print("Salário base: ");
        double baseSalary = Double.parseDouble(args[3]);

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("--------------------------------------");
        System.out.print("Digite o número de contratos: ");
        int contracts = Integer.parseInt(args[4]);

        int argIndex = 5;
        for (int i = 1; i <= contracts; i++) {
            System.out.println("Digite os dados do contrato #" + i);

            System.out.print("Digite a data do contrato (dd/MM/yyyy): ");
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[argIndex]);

            System.out.print("Digite o valor por hora: ");
            double valuePerHour = Double.parseDouble(args[argIndex + 1]);

            System.out.print("Digite o número de horas: ");
            int hours = Integer.parseInt(args[argIndex + 2]);

            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);

            argIndex += 3;
        }

        System.out.println("--------------------------------------");
        System.out.print("Digite o mês e o ano para calcular a renda (MM/YYYY): ");
        String monthAndYear = args[argIndex];
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Renda para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}
