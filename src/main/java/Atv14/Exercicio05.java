package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        int ip = sc.nextInt();

        String resp = (ip%2==0) ? "Seu número é par":"Seu número e impar";
        System.out.println(resp);
    }
}
