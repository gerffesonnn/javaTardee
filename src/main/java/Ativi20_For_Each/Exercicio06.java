package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio06 {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma frase:");
            String fraseOriginal = scanner.nextLine();
            scanner.close();



            System.out.println("Frase original: \"" + fraseOriginal + "\"");
            System.out.println("Palavras processadas:");


            String[] palavras = fraseOriginal.split("\\s+");


            for (String palavra : palavras) {

                String palavraLimpa = palavra.replaceAll("[.,;!?:\"\']", "");


                if (!palavraLimpa.isEmpty()) {
                    System.out.println(palavraLimpa);
                }
            }
        }}



