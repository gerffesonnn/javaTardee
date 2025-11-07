package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> listaDePresenca = new ArrayList<>();
            String nome;

            System.out.println("--- Cadastro de Nomes para Lista de Presença ---");
            System.out.println("Digite os nomes (um por linha). Digite 'FIM' para terminar.");

            while (true) {
                System.out.print("Nome: ");
                nome = scanner.nextLine();

                String nomeNormalizado = nome.trim().toLowerCase();

                if (nomeNormalizado.equals("fim")) {
                    break;
                }

                if (!listaDePresenca.contains(nomeNormalizado)) {
                    listaDePresenca.add(nomeNormalizado);
                    System.out.println("Nome '" + nome + "' adicionado com sucesso.");
                } else {
                    System.out.println("O nome '" + nome + "' já está na lista de presença. Ignorado.");
                }
            }

            scanner.close();

            System.out.println("\n--- Lista de Presença Final ---");
            for (String nomeNaLista : listaDePresenca) {
                System.out.println("- " + nomeNaLista);
            }
        }
    }