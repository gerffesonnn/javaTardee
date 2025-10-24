package Atv3_Estruturas_de_Repeticao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N;
        boolean ePrimo;
        int divisor;

        System.out.println("Digite um número inteiro positivo (N) para verificar se é primo:");

        N = scanner.nextInt();
        scanner.close();

        ePrimo = true;
        divisor = 2;

        if (N <= 1) {
            ePrimo = false;
        }
        while (divisor < N && ePrimo) {

            if (N % divisor == 0) {
                ePrimo = false;
            }
            divisor++;
        }
        if (ePrimo) {
            System.out.println(N + " é um número primo.");
        } else {
            System.out.println(N + " NÃO é um número primo.");
        }
        }

    }