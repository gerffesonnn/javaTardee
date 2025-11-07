package  Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Inversão de Vetor Dinâmica ---");
            System.out.print("Quantos números você deseja inserir no vetor? ");
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

            System.out.print("\nOrdem Original: [");
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println("]");

            System.out.print("Ordem Invertida: [");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
            System.out.println("]");
        }
    }