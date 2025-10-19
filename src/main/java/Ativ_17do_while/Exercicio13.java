package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        boolean continueMixing = true;

        do {
            if (counter < 10) {
                counter++;
            } else {
                System.out.println("Confirmar encerramento? Entre com 'S'");
                String input = scanner.next();
                if (input.equals("S")) {
                    continueMixing = false;
                    System.out.println("Mistura encerrada aos 10 minutos.");
                }
            }
        } while (counter < 10 || continueMixing);
    }
}
//"Mistura em Tanque (Tempo Mínimo)" refere-se ao intervalo de tempo mínimo recomendado