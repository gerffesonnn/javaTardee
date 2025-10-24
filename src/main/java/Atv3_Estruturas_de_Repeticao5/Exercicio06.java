package Atv3_Estruturas_de_Repeticao5;
import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();


            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor. Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
        scanner.close();
    }
}


