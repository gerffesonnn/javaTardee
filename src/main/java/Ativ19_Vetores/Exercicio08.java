package  Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Verificação de Par ou Ímpar Dinâmica ---");
            System.out.print("Quantos números você deseja inserir para verificar? ");
            int quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
                scanner.close();
                return;
            }


            int[] numeros = new int[quantidade];

            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println("\n--- Resultado da Classificação ---");

            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    System.out.println("O número " + numero + " é Par.");
                } else {
                    System.out.println("O número " + numero + " é Ímpar.");
                }
            }
        }
    }


