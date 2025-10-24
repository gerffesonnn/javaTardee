package atv17_if_else;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A frente está livre? (sim/nao)");
        String respostaFrente = sc.nextLine().toLowerCase();
        processarDecisao(respostaFrente, sc);
        sc.close();
    }

    public static void processarDecisao(String frenteLivre, Scanner sc) {

        if (frenteLivre.equals("sim")) {
            System.out.println("O robô segue em frente.");

        } else {
            System.out.println("A direita está livre? (sim/nao)");

            String respostaDireita = sc.nextLine().toLowerCase();

            if (respostaDireita.equals("sim")) {
                System.out.println("O robô vai pra direita.");
            } else {
                System.out.println("O robô vai pra esquerda.");
            }
        }
    }
}