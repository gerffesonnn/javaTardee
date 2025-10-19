package Ativ_17do_while;


import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double takt;
            double somaTempos = 0.0;
            int numEstacoes = 0;
            double media;

            System.out.print("Informe o valor do Takt desejado: ");
            takt = scanner.nextDouble();

            System.out.println("Informe os tempos das estações:");

            do {
                System.out.print("Tempo da estação: ");
                double tempoAtual = scanner.nextDouble();

                somaTempos += tempoAtual;
                numEstacoes++;

                media = somaTempos / numEstacoes;

                if (media > takt) {
                    System.out.println("Média atual (" + media + ") ainda acima do Takt (" + takt + "). Lendo próxima estação...");
                }

            } while (media > takt);

            scanner.close();

            System.out.println("\nSaída -> Média: " + media + " | Estações: " + numEstacoes);
        }// Takt time é o ritmo de produção necessário para atender à demanda do cliente
    }


