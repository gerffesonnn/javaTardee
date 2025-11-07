package  Ativ19_Vetores;

import java.util.Scanner;

public class Exercicio06 {
        public static void main(String[] args) {
            int[] numeros = {1, 5, 8, 12, 15, 22, 30, 45, 50, 78};
            Scanner scanner = new Scanner(System.in);
            boolean encontrado = false;
            int posicaoEncontrada = -1;

            System.out.println("--- Busca de Número no Vetor ---");
            System.out.println("Vetor disponível para busca: [1, 5, 8, 12, 15, 22, 30, 45, 50, 78]");

            System.out.print("Digite o número que deseja buscar: ");
            int numeroBusca = scanner.nextInt();
            scanner.close();

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroBusca) {
                    encontrado = true;
                    posicaoEncontrada = i;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("\nNúmero encontrado! O número " + numeroBusca +
                        " existe no vetor, na posição (índice) " + posicaoEncontrada + ".");
            } else {
                System.out.println("\nNúmero não encontrado. O número " + numeroBusca +
                        " não existe no vetor.");
            }
        }
    }


