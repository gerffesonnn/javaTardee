package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        ArrayList<Double> precos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Produtos (listar, filtrar, limpar)");
            System.out.println("1 - Adicionar preço");
            System.out.println("2 - Listar todos os preços");
            System.out.println("3 - Listar preços > X");
            System.out.println("4 - Limpar lista");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o preço a ser adicionado: ");
                double novoPreco = scanner.nextDouble();
                precos.add(novoPreco);
                System.out.println("Preço adicionado com sucesso.");
            } else if (opcao == 2) {
                if (precos.isEmpty()) {
                    System.out.println("A lista de preços está vazia.");
                } else {
                    System.out.println("Lista de preços:");
                    for (Double preco : precos) {
                        System.out.println(preco);
                    }
                }
            } else if (opcao == 3) {
                if (precos.isEmpty()) {
                    System.out.println("A lista de preços está vazia.");
                } else {
                    System.out.print("Digite o valor X para filtrar: ");
                    double valorX = scanner.nextDouble();
                    System.out.println("Preços maiores que " + valorX + ":");
                    boolean encontrou = false;
                    for (Double preco : precos) {
                        if (preco > valorX) {
                            System.out.println(preco);
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Nenhum preço encontrado maior que " + valorX + ".");
                    }
                }
            } else if (opcao == 4) {
                precos.clear();
                System.out.println("Lista de preços limpa.");
            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}