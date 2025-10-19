package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean result;
        int attempts = 0;

        do {
            System.out.println("Teste de peça");
            result = scanner.nextBoolean();
            attempts++;
        } while (!result);
        System.out.println("Tentativas: " + attempts);
    }
}
//Reprocesso de peça: É o conjunto de operações adicionais realizadas em um produto que não atendeu aos padrões de qualidade esperados Reprocesso de peça é o conjunto de operações adicionais realizadas em um produto que não atendeu aos padrões de qualidade esperados.