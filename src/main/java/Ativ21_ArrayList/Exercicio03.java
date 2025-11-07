package Ativ21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome;

        System.out.println("Digite os nomes (um por linha). Digite FIM para terminar.");

        do {
            System.out.print("Nome: ");
            nome = sc.nextLine();
            if (!nome.equalsIgnoreCase("FIM")) {
                String nomeNormalizado = nome.trim().toLowerCase();
                if (!nomes.contains(nomeNormalizado)) {
                    nomes.add(nomeNormalizado);
                } else {
                    System.out.println("Nome já existe na lista. Não foi adicionado.");
                }
            }
        } while (!nome.equalsIgnoreCase("FIM"));

        System.out.println("\n--- Nomes cadastrados ---");
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}