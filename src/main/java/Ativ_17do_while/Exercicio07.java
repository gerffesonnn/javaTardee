package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double input;
        do {
            System.out.println("Insira o consumo (kwh)");
            input = scanner.nextDouble();
            if (input != 0) {
                sum += input;
                count++;
            }
        } while (input != 0);

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Total: %.0f | Média: %.0f", sum, average);
        } else {
            System.out.println("Nenhum consumo registrado.");
        }
    }
}
//Consumo kWh: É a unidade de medida do consumo de energia elétrica, representando a quantidade de energia utilizada ao longo do tempo.