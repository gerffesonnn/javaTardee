package Ativ19_Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o "+ (i + 1)+" numero ");
            numeros[i]= scanner.nextInt();
            if (numeros[i] >= 0) {
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("No vetor, existem:");
        System.out.println(contadorPositivos + " números positivos.");
        System.out.println(contadorNegativos + " números negativos.");
    }
}
