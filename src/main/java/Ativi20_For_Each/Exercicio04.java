package Ativi20_For_Each;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> notasList = new ArrayList<>();

            System.out.println("--- Entrada de Notas ---");
            System.out.print("Quantas notas deseja inserir? ");

            int quantidadeNotas = scanner.nextInt();

            for (int i = 0; i < quantidadeNotas; i++) {
                System.out.print("Digite a nota " + (i + 1) + " (0-100): ");
                int nota = scanner.nextInt();
                notasList.add(nota);
            }

            scanner.close();

            System.out.println("\n--- Relatório de Notas ---");

            for (int nota : notasList) {
                String situacao;


                if (nota >= 60) {
                    situacao = "Aprovado";
                } else {
                    situacao = "Reforço";
                }


                System.out.println(nota + " -> " + situacao);
            }
        }
    }




