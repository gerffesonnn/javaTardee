package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPieces = 0;
        int totalFailures = 0;
        double failureRate = 0;

        System.out.println("Insira o número de peças e falhas por ciclo (ex.: 100 5). O programa para quando a taxa ≤ 2%.");

        do {
            int pieces;
            int failures;

            try {
                pieces = scanner.nextInt();
                failures = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Entrada inválida! Insira números inteiros. Tente novamente.");
                continue;
            }

            totalPieces += pieces;
            totalFailures += failures;

            if (totalPieces > 0) {
                failureRate = ((double) totalFailures / totalPieces) * 100;
            } else {
                failureRate = 100;
            }

            System.out.println("Taxa atual: " + (int) Math.round(failureRate) + "%");

        } while (failureRate > 2.0);

        System.out.println("Taxa final: " + (int) Math.round(failureRate) + "%");
    }
}
//A Inspeção por Visão Computacional é um sistema automatizado que utiliza câmeras industriais e software com algoritmos de Inteligência Artificial para realizar a inspeção visual de produtos em linhas de produção.