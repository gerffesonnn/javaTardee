package Atv3_Estruturas_de_Repeticao5;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N;
        long somatoria = 0;

        System.out.println("Digite o valor limite (N) para o somatório:");

        N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            somatoria = somatoria + i;
        }

        System.out.println("O somatório dos números de 1 até " + N + " é: " + somatoria);
     }
        }