package Ativ21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        System.out.println("--- Cadastro de Temperaturas da Semana (7 dias) ---");
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }
        scanner.close();

        System.out.println("\nTemperaturas da semana:");
        for (Double temperatura : temperaturas) {
            if (temperatura >= 35) {
                System.out.println(temperatura + " - Alerta de calor");
            } else {
                System.out.println(temperatura);
            }
        }
    }
}