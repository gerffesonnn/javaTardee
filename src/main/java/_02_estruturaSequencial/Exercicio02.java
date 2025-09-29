package _02_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double soma = Math.pow(n1,2);

        System.out.println("O dobro do numero é " + soma);

    }
}
