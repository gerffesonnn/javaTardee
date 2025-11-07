package Ativ19_Vetores;

public class Exercicio11 {
    public static void main(String[] args) {

        int[] idades = {15, 20, 25, 30, 35};

        double soma = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];
        }

        double media = soma / idades.length;

        System.out.println("Média: " + media);
    }
}
