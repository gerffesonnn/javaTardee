package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("java");
        palavras.add("python");
        palavras.add("c");
        palavras.add("javascript");
        palavras.add("go");
        palavras.add("html");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho mínimo para as palavras: ");
        int tamanhoMinimo = scanner.nextInt();
        scanner.close();

        if (tamanhoMinimo >= 0) {
            palavras.removeIf(palavra -> palavra.length() < tamanhoMinimo);

            System.out.println("Lista final:");
            for (String palavra : palavras) {
                System.out.println(palavra);
            }
        } else {
            System.out.println("O tamanho mínimo deve ser um valor positivo.");
        }
    }
}