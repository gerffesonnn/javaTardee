package Orientacao_a_Objeto.JurosCompostos;

import java.util.Locale;
import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Juros Compostos");

        System.out.print("Digite o valor inicial do investimento: ");
        double capital = sc.nextDouble();

        if (capital <= 0) {
            System.out.println("Valor inválido! O capital deve ser maior que zero.");
            sc.close();
            return;
        }

        System.out.print("Digite a taxa de juros (% ao período): ");
        double taxa = sc.nextDouble();

        if (taxa < 0) {
            System.out.println("Taxa de juros inválida! Deve ser zero ou positiva.");
            sc.close();
            return;
        }

        System.out.print("Digite o número de períodos: ");
        int periodos = sc.nextInt();

        if (periodos <= 0) {
            System.out.println("Número de períodos inválido! Deve ser maior que zero.");
            sc.close();
            return;
        }

        double resultado = Compostos.calcular(capital, taxa, periodos);

        System.out.printf("O valor final do investimento é: %.2f%n", resultado);

        sc.close();
    }
}