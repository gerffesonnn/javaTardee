package Atv3_Estruturas_de_Repeticao5;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N_inicial;

        System.out.println("Digite o número inicial para a contagem regressiva:");

        N_inicial = scanner.nextInt();
        scanner.close();

        System.out.println("\nContagem Regressiva:");

        for (int i = N_inicial; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Contagem concluída!");
    }
}
