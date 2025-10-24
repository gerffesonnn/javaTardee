package Atv3_Estruturas_de_Repeticao5;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        long fatorial;
        int contador;

        System.out.println("Digite um número inteiro não negativo para calcular o fatorial (N):");

        N = scanner.nextInt();
        scanner.close();

        if (N < 0) {
            System.out.println("Erro: O fatorial não é definido para números negativos.");
        } else {
            fatorial = 1;
            contador = N;

            while (contador > 1) {

                fatorial = fatorial * contador;

                contador = contador - 1;
            }

            System.out.println("O fatorial de " + N + " (" + N + "!) é: " + fatorial);
    }
}}
