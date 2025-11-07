package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o texto a ser filtrado:");

            String texto = scanner.nextLine();

            scanner.close();

            String[] palavrasArray = texto.split("\\s+");
            List<String> listaDePalavras = new ArrayList<>();

            for (String palavra : palavrasArray) {
                String palavraLimpa = palavra.replaceAll("[.,?!;:]", "");
                if (!palavraLimpa.isEmpty()) {
                    listaDePalavras.add(palavraLimpa);
                }
            }

            System.out.println("\nPalavras com até 4 letras:");
            for (String palavra : listaDePalavras) {
                if (palavra.length() <= 4) {
                    System.out.println(palavra);
                }
            }
        }
    }