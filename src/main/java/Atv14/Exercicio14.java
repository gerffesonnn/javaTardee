package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("insira nota");
        double a= sc.nextDouble();
        String resp = (a>=7) ? "Aprovado" : "reprovado";
        System.out.println(resp);
    }
}
