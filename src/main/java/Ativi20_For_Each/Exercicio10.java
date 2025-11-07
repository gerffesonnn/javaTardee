package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio10 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Entrada de Pontuações ---");
            System.out.print("Quantos jogadores você deseja registrar? ");
            int numeroDeJogadores = scanner.nextInt();

            int[] pontuacoes = new int[numeroDeJogadores];

            for (int i = 0; i < numeroDeJogadores; i++) {
                System.out.print("Digite a pontuação do jogador " + (i + 1) + ": ");
                pontuacoes[i] = scanner.nextInt();
            }

            scanner.close();

            int destaques = 0;
            int abaixoDeCinquenta = 0;

            System.out.println("\n--- Pontuações Registradas ---");

            for (int pontos : pontuacoes) {
                System.out.println("Pontuação: " + pontos);
            }

            for (int pontos : pontuacoes) {
                if (pontos >= 100) {
                    destaques++;
                }

                if (pontos < 50) {
                    abaixoDeCinquenta++;
                }
            }

            System.out.println("\n--- Resumo da Classificação ---");
            System.out.println("Total de jogadores: " + pontuacoes.length);
            System.out.println("Destaques (>= 100): " + destaques + " | Abaixo de 50: " + abaixoDeCinquenta);
        }
    }

