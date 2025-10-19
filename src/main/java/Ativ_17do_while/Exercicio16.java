package Ativ_17do_while;


import java.util.Scanner;

public class Exercicio16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contadorA = 0;
            int contadorR = 0;

            int amostrasLidas = 0;
            final int TOTAL_AMOSTRAS = 10;
            String entrada;

            System.out.println("Digite os resultados para 10 amostras (A/R):");

            while (amostrasLidas < TOTAL_AMOSTRAS) {

                do {
                    System.out.print("Amostra " + (amostrasLidas + 1) + "/" + TOTAL_AMOSTRAS + ": ");
                    entrada = scanner.nextLine().trim().toUpperCase();

                    if (!entrada.equals("A") && !entrada.equals("R")) {
                        System.out.println("Entrada inválida! Digite apenas 'A' ou 'R'.");
                    }

                } while (!entrada.equals("A") && !entrada.equals("R"));

                if (entrada.equals("A")) {
                    contadorA++;
                } else {
                    contadorR++;
                }

                amostrasLidas++;
            }

            scanner.close();

            System.out.println("Saída -> " +
                    "A: " + contadorA +
                    " | R: " + contadorR);
        }

    }




