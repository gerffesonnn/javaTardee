package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio12 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int CAPACIDADE_MAXIMA = 20;
            String[] nomes = new String[CAPACIDADE_MAXIMA];
            int countNomes = 0;
            int opcao;

            do {
                System.out.println("\n--- Menu de Cadastro ---");
                System.out.println("1- Cadastrar nomes");
                System.out.println("2- Listar nomes");
                System.out.println("3- Listar nomes que começam com uma letra específica");
                System.out.println("0- Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        if (countNomes < CAPACIDADE_MAXIMA) {
                            System.out.print("Digite o nome a cadastrar: ");
                            nomes[countNomes] = scanner.nextLine();
                            countNomes++;
                            System.out.println("Nome cadastrado com sucesso!");
                        } else {
                            System.out.println("ERRO: Capacidade máxima de cadastro atingida (" + CAPACIDADE_MAXIMA + ").");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Nomes Cadastrados ---");
                        if (countNomes == 0) {
                            System.out.println("Nenhum nome cadastrado ainda.");
                        } else {
                            for (int i = 0; i < countNomes; i++) {
                                System.out.println("- " + nomes[i]);
                            }
                        }
                        break;

                    case 3:
                        // Listar nomes que começam com uma letra específica (usando startsWith)
                        if (countNomes == 0) {
                            System.out.println("Nenhum nome cadastrado para filtrar.");
                        } else {
                            System.out.print("Digite a letra inicial para busca: ");
                            String letraInput = scanner.nextLine().trim();

                            if (letraInput.isEmpty()) {
                                System.out.println("Letra inválida.");
                                break;
                            }

                            // Captura apenas o primeiro caractere inserido pelo usuário
                            String prefixo = letraInput.substring(0, 1);
                            boolean encontrado = false;

                            System.out.println("\n--- Nomes Iniciados com '" + prefixo + "' ---");

                            // Usamos um for loop limitado para garantir que só verificamos nomes válidos
                            for (int i = 0; i < countNomes; i++) {
                                // Usamos toUpperCase() para tornar a busca insensível a maiúsculas/minúsculas
                                if (nomes[i].toUpperCase().startsWith(prefixo.toUpperCase())) {
                                    System.out.println("- " + nomes[i]);
                                    encontrado = true;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Nenhum nome encontrado com essa inicial.");
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Saindo do programa. Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 0);

            scanner.close();
        }
    }
