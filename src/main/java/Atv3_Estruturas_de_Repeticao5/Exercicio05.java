package Atv3_Estruturas_de_Repeticao5;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        double soma = 0.0;
        double nota;
        double media;

        System.out.println("Quantas notas deseja inserir?");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.err.println("Entrada inválida. Por favor, insira um número inteiro para a quantidade de notas.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a nota número " + i + ":");

            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();

                soma = soma + nota;
            } else {
                System.err.println("Entrada inválida. Por favor, insira um número válido para a nota.");
                scanner.next();
                i--;
            }
        }

        if (n > 0) {
            media = soma / n;

            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota inserida. A média não pode ser calculada.");
        }
    }
}