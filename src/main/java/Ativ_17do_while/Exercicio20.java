package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio20 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int totalPrateleiras;
            int prateleirasValidadas = 0;

            System.out.print("Informe o número total de prateleiras a serem validadas: ");
            totalPrateleiras = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Iniciando validação...");

            do {
                System.out.print("Leia a etiqueta da prateleira " + (prateleirasValidadas + 1) + "/" + totalPrateleiras + ": ");
                scanner.nextLine();


                prateleirasValidadas++;

            } while (prateleirasValidadas < totalPrateleiras);

            scanner.close();

            System.out.println("\nSaída -> Inventário concluído.");
        } // AS/RS significa Automated Storage and Retrieval System. Em português, a tradução é Sistema Automatizado de Armazenamento e Recuperação.

}


