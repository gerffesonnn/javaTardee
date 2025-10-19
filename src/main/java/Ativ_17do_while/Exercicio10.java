package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int ciclos = 0;
            int paradas = 0;
            boolean entradaValida;

            do {
                entradaValida = false;

                while (!entradaValida) {
                    System.out.print("Digite o número de ciclos de produção (>0): ");
                    if (scanner.hasNextInt()) {
                        ciclos = scanner.nextInt();
                        if (ciclos > 0) {
                            entradaValida = true;
                        } else {
                            System.out.println("Ciclos de produção devem ser maiores que zero.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                        scanner.next();
                    }
                }

                entradaValida = false;

                while (!entradaValida) {
                    System.out.print("Digite o número de paradas (>=0): ");
                    if (scanner.hasNextInt()) {
                        paradas = scanner.nextInt();
                        if (paradas >= 0) {
                            entradaValida = true;
                        } else {
                            System.out.println("O número de paradas não pode ser negativo.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                        scanner.next();
                    }
                }

                System.out.print("Operador, confirme a saída (s/n): ");
                String confirmacao = scanner.next();
                entradaValida = !confirmacao.equalsIgnoreCase("n");

            } while (!entradaValida);

            if (ciclos + paradas > 0) {
                double taxaDisponibilidade = (double) ciclos / (ciclos + paradas);
                System.out.printf("Disponibilidade: %.2f%n", taxaDisponibilidade);
            } else {
                System.out.println("Não é possível calcular a disponibilidade com zero ciclos e zero paradas.");
            }

            scanner.close();
            //OEE significa "Overall Equipment Effectiveness" (Eficiência Global do Equipamento), um indicador usado na indústria para medir a eficiência de máquinas e equipamentos de produção
        }
    }

