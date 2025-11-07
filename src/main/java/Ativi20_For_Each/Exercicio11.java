package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        String itensString = "arroz:alimento,feijao:alimento,tv:eletronico,notebook:eletronico,banana:alimento";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a categoria a ser filtrada: ");
        String categoriaEscolhida = scanner.nextLine();
        scanner.close();

        String[] itensArray = itensString.split(",");

        System.out.println("\n--- Todos os itens ---");
        for (String item : itensArray) {
            System.out.println(item);
        }

        System.out.println("\n--- Itens da categoria '" + categoriaEscolhida + "' ---");
        for (String item : itensArray) {
            String[] partes = item.split(":");
            String nome = partes[0];
            String categoria = partes[1];

            if (categoria.equals(categoriaEscolhida)) {
                System.out.println(nome + " (" + categoria + ")");
    }
}}}