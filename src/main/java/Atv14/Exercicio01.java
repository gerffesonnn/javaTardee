package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua idade");
        int id = sc.nextInt();

        String resp = (id>=18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resp);

    }
}
