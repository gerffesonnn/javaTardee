package _02_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;
public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;

        System.out.println("A soma dos numeros é "+ soma);

    }
}
