package Orientacao_a_Objeto.Conversor_Temperatura;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a temperatura a ser convertida: ");
        double temperatura = sc.nextDouble();

        double resultado;
        Temperatura conversor = new Temperatura();

        if (opcao == 1) {
            resultado = conversor.celsiusParaFahrenheit(temperatura);
            System.out.printf("%.2f °C = %.2f °F%n", temperatura, resultado);
        } else if (opcao == 2) {
            resultado = conversor.fahrenheitParaCelsius(temperatura);
            System.out.printf("%.2f °F = %.2f °C%n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}