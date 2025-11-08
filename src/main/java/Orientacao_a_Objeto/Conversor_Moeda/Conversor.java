package Orientacao_a_Objeto.Conversor_Moeda;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Moeda ");
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Real para Dólar");
        System.out.println("2 - Real para Euro");
        System.out.println("3 - Dólar para Real");
        System.out.println("4 - Euro para Real");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor a ser convertido: ");
        String entrada = sc.nextLine();

        String[] partes = entrada.trim().split(" ");
        double valor = Double.parseDouble(partes[0]);

        double resultado;

        if (opcao == 1) {
            resultado = Moeda.realParaDolar(valor);
            System.out.printf("R$ %.2f = $ %.2f%n", valor, resultado);
        } else if (opcao == 2) {
            resultado = Moeda.realParaEuro(valor);
            System.out.printf("R$ %.2f = € %.2f%n", valor, resultado);
        } else if (opcao == 3) {
            resultado = Moeda.dolarParaReal(valor);
            System.out.printf("$ %.2f = R$ %.2f%n", valor, resultado);
        } else if (opcao == 4) {
            resultado = Moeda.euroParaReal(valor);
            System.out.printf("€ %.2f = R$ %.2f%n", valor, resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
