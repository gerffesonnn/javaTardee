package Orientacao_a_Objeto.Numero_Fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de Números Primos");
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        boolean primo = Primo.ePrimo(numero);

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        sc.close();
    }
}