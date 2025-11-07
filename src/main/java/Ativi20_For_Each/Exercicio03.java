package Ativi20_For_Each;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de preços (N): ");
        int n = scanner.nextInt();

        double[] precos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        double soma = 0.0;
        System.out.println("\nPreços informados:");
        for (double preco : precos) {
            System.out.println(preco);
            soma += preco;
        }

        double media = soma / n;
        System.out.printf("\nA média dos preços é: %.2f\n", media);

    }
}