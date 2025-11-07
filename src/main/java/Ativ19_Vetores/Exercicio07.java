package Ativ19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}