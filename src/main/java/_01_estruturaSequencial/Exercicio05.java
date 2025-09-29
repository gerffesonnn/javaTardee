package _01_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double valorUnitarioPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double valorTotal = (quantidadePeca1 * valorUnitarioPeca1) + (quantidadePeca2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}
