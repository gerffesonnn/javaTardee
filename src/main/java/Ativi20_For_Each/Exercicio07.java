package Ativi20_For_Each;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static class Produto {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
        public String formatar() {
            return nome + " - R$" + String.format("%.2f", preco);
        }
    }
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = 3;

        Produto[] vetorProdutos = new Produto[N];

        System.out.println("--- Cadastro de Produtos ---");

        for (int i = 0; i < N; i++) {
            System.out.printf("\nProduto #%d:\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            vetorProdutos[i] = new Produto(nome, preco);
        }

        System.out.println("\n--- LISTAGEM COMPLETA ---");

        for (Produto p : vetorProdutos) {
            System.out.println(p.formatar());
        }

        System.out.println("\n--- PRODUTOS ACIMA DE R$50.00 (CAROS) ---");

        for (Produto p : vetorProdutos) {
            if (p.preco > 50.00) {
                System.out.println(p.formatar() + " (caro)");
            }
        }
    }
}