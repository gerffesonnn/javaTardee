package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos dias");
        int dia = sc.nextInt();
        int horas = dia*24;

        System.out.println(horas + " Horas");

    }
}
