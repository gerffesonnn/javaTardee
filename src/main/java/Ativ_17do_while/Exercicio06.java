package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
            int aprovadas = 0;
            int reprovadas = 0;
            String entrada;

            System.out.println("Digite os resultados das inspeções ('A' para aprovada, 'R' para reprovada). Digite 'FIM' para encerrar.");

            do {
                System.out.print("Entrada: ");
                entrada = scanner.nextLine().toUpperCase();

                if (entrada.equals("A")) {
                    aprovadas++;
                } else if (entrada.equals("R")) {
                    reprovadas++;
                } else if (!entrada.equals("FIM")) {
                    System.out.println("Entrada inválida. Por favor, digite 'A', 'R' ou 'FIM'.");
                }

            } while (!entrada.equals("FIM"));

            System.out.println("Aprovadas: " + aprovadas + " | Reprovadas: " + reprovadas);

            scanner.close();
        }
    }


