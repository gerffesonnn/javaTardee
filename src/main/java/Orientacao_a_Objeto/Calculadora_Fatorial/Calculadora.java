package Orientacao_a_Objeto.Calculadora_Fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Fatorial");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        long resultado = Fatorial.calcular(numero);

        System.out.println("O fatorial de " + numero + " é " + resultado + ".");

        sc.close();
    }
}
