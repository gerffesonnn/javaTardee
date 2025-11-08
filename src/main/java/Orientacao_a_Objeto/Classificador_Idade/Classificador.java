package Orientacao_a_Objeto.Classificador_Idade;

import java.util.Locale;
import java.util.Scanner;

public class Classificador {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificador de Idade");
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();

        String classificacao = Idade.classificar(idade);

        System.out.println("Classificação: " + classificacao);

        sc.close();
    }
}
