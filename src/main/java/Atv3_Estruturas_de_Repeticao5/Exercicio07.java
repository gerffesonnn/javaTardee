package Atv3_Estruturas_de_Repeticao5;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        int n;
        int soma = 0;
        int contador = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        n = scanner.nextInt();

        while (contador <= n) {
            if (contador % 2 != 0) {
                soma = soma + contador;
            }
            contador++;
        }
        System.out.println("A soma de todos os números ímpares entre 1 e " + n + " é: " + soma);
    }
}

