package Ativi20_For_Each;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes");
        String entrada = sc.nextLine();
        String[] nomes = entrada.split(",");

        System.out.println("Lista de Presença:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "º " + nomes[i].trim());}
        }}