package Atv3_Estruturas_de_Repeticao5;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int N;
                int contador;

                System.out.println("Digite o valor limite (N):");

                N = scanner.nextInt();
                scanner.close();

                contador = 1;

                System.out.println("Números pares entre 1 e " + N + ":");

                while (contador <= N) {

                    if (contador % 2 == 0) {
                        System.out.println(contador);
                    }

                    contador = contador + 1;
                }
            }
        }