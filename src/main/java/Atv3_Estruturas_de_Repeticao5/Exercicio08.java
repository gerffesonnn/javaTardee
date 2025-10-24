package Atv3_Estruturas_de_Repeticao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        long N;
        long numAtual;
        int contadorDigitos;

        System.out.println("Digite um número inteiro positivo:");

        N = scanner.nextLong();
        scanner.close();

        contadorDigitos = 0;
        numAtual = Math.abs(N);

        if (numAtual == 0) {
            contadorDigitos = 1;
        } else {
            while (numAtual > 0) {

                numAtual = numAtual / 10;
                contadorDigitos++;
            }
        }
        System.out.println("O número " + N + " possui " + contadorDigitos + " dígitos.");
        }
    }
