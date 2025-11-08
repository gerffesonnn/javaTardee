package Orientacao_a_Objeto.Contador_Palavras;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Contador de Palavras");
        System.out.println("Digite uma frase e o programa contará quantas palavras ela possui.");
        System.out.print("Frase: ");

        String frase = sc.nextLine();

        int total = Palavras.contar(frase);

        System.out.println("A frase digitada contém " + total + " palavra(s).");

        sc.close();
    }
}