package Ativ_17do_while;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio14 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> ocorrencias = new HashMap<>();
            String codigoDefeito;

            System.out.println("Digite os códigos de defeito (D01, D02, etc.). Digite 'FIM' para terminar:");

            do {
                System.out.print("Código: ");
                codigoDefeito = scanner.nextLine().trim().toUpperCase();

                if (!codigoDefeito.equals("FIM")) {
                    ocorrencias.merge(codigoDefeito, 1, Integer::sum);

                /*
                // Alternativa usando if/else (mais manual):
                if (ocorrencias.containsKey(codigoDefeito)) {
                    ocorrencias.put(codigoDefeito, ocorrencias.get(codigoDefeito) + 1);
                } else {
                    ocorrencias.put(codigoDefeito, 1);
                }
                */
                }

            } while (!codigoDefeito.equals("FIM"));

            scanner.close();

            System.out.print("Saída -> ");
            int i = 0;
            for (Map.Entry<String, Integer> entry : ocorrencias.entrySet()) {
                System.out.print(entry.getKey() + ": " + entry.getValue());
                if (i < ocorrencias.size() - 1) {
                    System.out.print(" | ");
                }
                i++;
            }
            System.out.println();
        }
    }


