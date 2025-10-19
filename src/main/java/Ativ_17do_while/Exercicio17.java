package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double value;
        int totalReadings = 0;
        int consecutiveCount = 0;

        do {
            System.out.println("Insira o nível RMS de vibração");
            value = scanner.nextDouble();
            totalReadings++;
            if (value < 2.5) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
        } while (consecutiveCount < 3);

        System.out.println("Leituras totais: " + totalReadings);
    }
}
//Um monitor de vibração para predição é um sistema que utiliza sensores e algoritmos para coletar, analisar e interpretar dados de vibração de máquinas e equipamentos, com o objetivo de prever falhas e problemas antes que ocorram.