package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class Exercicio12 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> fila = new ArrayList<>();

            System.out.println("Digite os nomes na fila, separados por vírgula (ex: Joao, Maria, Pedro):");
            String inputNomes = scanner.nextLine();

            String[] nomesArray = inputNomes.split(",");
            for (String nome : nomesArray) {
                String nomeNormalizado = nome.trim();
                if (!nomeNormalizado.isEmpty()) {
                    fila.add(nomeNormalizado);
                }
            }

            if (fila.isEmpty()) {
                System.out.println("A fila está vazia. Encerrando o programa.");
                scanner.close();
                return;
            }

            System.out.println("Fila inicial: " + fila);

            System.out.println("Digite o número de rotações (k):");
            int k = 0;
            try {
                k = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Valor inválido para k. Deve ser um número inteiro.");
                scanner.close();
                return;
            }

            if (k < 0) {
                System.out.println("O número de rotações (k) não pode ser negativo. Usando k=0.");
                k = 0;
            }

            for (int i = 0; i < k; i++) {
                if (!fila.isEmpty()) {
                    String primeiro = fila.remove(0);
                    fila.add(primeiro);
                }
            }

            System.out.println("\nOrdem final da fila após " + k + " rotações:");
            for (String nome : fila) {
                System.out.println("- " + nome);
            }

            scanner.close();
        }
    }