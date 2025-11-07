package Ativ19_Vetores;
import java.util.Scanner;
public class Exercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Substituição de Elemento Dinâmica ---");
            System.out.print("Quantos números você deseja inserir no vetor? ");
            int quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.println("A quantidade deve ser maior que zero.");
                scanner.close();
                return;
            }

            // Crie um vetor com o tamanho especificado pelo usuário
            int[] numeros = new int[quantidade];

            // Loop para preencher o vetor
            for (int i = 0; i < quantidade; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Pede ao usuário a posição (base 1) e o novo valor
            System.out.print("\nQual a POSIÇÃO (ex: 1 para o primeiro, " + quantidade + " para o último) você quer substituir? ");
            int posicaoDesejada = scanner.nextInt();

            System.out.print("Por qual NOVO VALOR você quer substituir? ");
            int novoValor = scanner.nextInt();

            scanner.close();

            // Validar a posição informada pelo usuário (que está em base 1)
            if (posicaoDesejada < 1 || posicaoDesejada > quantidade) {
                System.out.println("Erro: Posição inválida.");
                return;
            }

            // Converter a posição base 1 para o índice base 0 do Java
            int indice = posicaoDesejada - 1;

            // Realiza a substituição
            numeros[indice] = novoValor;

            // Imprime o vetor alterado (usando for-each para impressão)
            System.out.println("\n--- Resultado ---");
            System.out.print("Vetor Alterado: [");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + (i == numeros.length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }
    }


