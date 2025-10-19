package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota");
        int no = sc.nextInt();

        String resp = (no>=7) ? "Aprovado" : "Reprovado";
        System.out.println(resp);


    }
}
