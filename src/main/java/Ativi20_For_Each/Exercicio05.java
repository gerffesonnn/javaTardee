package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] catalogo = {"A12", "B07", "A12", "C03", "A12", "D15", "B07", "E21"};
        Scanner scanner = new Scanner(System.in);
        String alvo;

        do {
            System.out.println("Digite o código a ser buscado (ou SAIR para encerrar):");
            alvo = scanner.nextLine();

            if (!alvo.equalsIgnoreCase("SAIR")) {
                int contador = 0;
                for (String codigo : catalogo) {
                    if (codigo.equalsIgnoreCase(alvo)) {
                        contador++;
                    }
                }
                System.out.printf("O alvo %s aparece %d vez(es).\n", alvo, contador);
            }

        } while (!alvo.equalsIgnoreCase("SAIR"));

        System.out.println("Programa encerrado.");
    }
}
