package Orientacao_a_Objeto.Calculadora_Media;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de Média");
        System.out.print("Digite o número de notas: ");
        int quantidadeNotas = sc.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Insira uma nota entre 0 e 10.");
                i--;
            } else {
                notas[i] = nota;
            }
        }

        double media = Media.calcularMedia(notas);
        System.out.printf("A média do aluno é: %.2f%n", media);

        sc.close();
    }
}
