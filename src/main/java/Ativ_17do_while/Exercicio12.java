package Ativ_17do_while;


import java.util.Scanner;

public class Exercicio12 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contadorPaletes = 0;
            int numeroPalete;

            System.out.println("Início da conferência. Digite os números dos paletes (digite -1 para sair):");

            do {
                System.out.print("Digite o número do palete: ");

                if (scanner.hasNextInt()) {
                    numeroPalete = scanner.nextInt();

                    if (numeroPalete != -1) {
                        contadorPaletes++;
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.next();
                    numeroPalete = 0;
                }

            } while (numeroPalete != -1);

            scanner.close();

            System.out.println("Paletes conferidos: " + contadorPaletes);
        }} //WMS significa Warehouse Management System (Sistema de Gerenciamento de Armazém), um software que controla, automatiza e otimiza as operações logísticas de um armazém ou centro de distribuição





