package Ativ19_Vetores;

import java.util.Locale;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int[] vetor = {6, 9, 15, 7, 4, 18, 21, 13, 8, 3};

        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0) {
                contador++;
            } else {
            }
        }

        System.out.println("6, 9, 15, 7, 4, 18, 21, 13, 8, 3 Divisíveis por 3: " + contador);
    }
}
