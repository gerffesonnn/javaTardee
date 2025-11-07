package  Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Encontrando Maior e Menor Número Dinâmico ---");
            System.out.print("Quantos números você deseja inserir? ");
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

            int maior = numeros[0];
            int menor = numeros[0];


            for (int i = 1; i < numeros.length; i++) {
                int numeroAtual = numeros[i];


                if (numeroAtual > maior) {
                    maior = numeroAtual;
                }

                if (numeroAtual < menor) {
                    menor = numeroAtual;
                }
            }

            System.out.println("\n--- Resultado ---");

            System.out.println("Total de números inseridos: " + quantidade);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }


