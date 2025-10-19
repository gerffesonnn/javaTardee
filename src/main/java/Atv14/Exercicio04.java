package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura?");
        int c = sc.nextInt();

        String resp = (c<18) ? "Frio" : "Quente";
        System.out.println(resp);
    }
}
