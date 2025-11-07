package Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        double[] notas = new double[5];
        double soma = 0;
        double media;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        scanner.close();

        media = soma / notas.length;

        System.out.printf("\nA média das notas é: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Parabéns! Desempenho excelente.");
        } else if (media >= 5.0) {
            System.out.println("Desempenho bom. Continue se esforçando.");
        } else {
            System.out.println("Desempenho insatisfatório. É preciso melhorar.");
        }
    }
}

