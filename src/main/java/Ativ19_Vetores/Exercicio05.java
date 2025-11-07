package Ativ19_Vetores;

import java.util.Locale;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String[] entrada = new String[]{"casa", "banana", "carro", "sol", "computador"};

        String[] vetor = entrada;
        int contador = 0;

        for (String palavra : vetor) {
            if (palavra.length() > 5) {
                contador++;
            }
        }

        System.out.println("Mais de 5 caracteres: " + contador);
    }
}