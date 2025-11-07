package  Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int somaTotal = 0;

            System.out.println("--- Soma de Números Dinâmica ---");
            System.out.print("Quantos números você deseja somar? ");
            int quantidade = scanner.nextInt();

            int[] numeros = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println("\n--- Calculando a Soma ---");

            for (int numero : numeros) {
                somaTotal += numero;
            }

            System.out.println("Soma total dos " + quantidade + " números: " + somaTotal);
        }
    }

