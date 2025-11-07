package Ativi20_For_Each;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite as palavras separadas por espaços (ex: sol nuvem lua astro):");
            String inputLine = scanner.nextLine();

            String[] palavras = inputLine.split("\\s+");

            scanner.close();

            System.out.println("\nPalavras originais: " + Arrays.toString(palavras));
            System.out.println("Palavras com até 4 letras:");

            filtrarEImprimir(palavras);
        }
        public static void filtrarEImprimir(String[] vetorDePalavras) {
            boolean primeiraImpressao = true;

            for (String palavra : vetorDePalavras) {
                if (palavra.length() <= 4) {
                    if (!primeiraImpressao) {
                        System.out.print(", ");
                    } else {
                        primeiraImpressao = false;
                    }
                    System.out.print(palavra);
                }
            }
            System.out.println();
        }
    }



