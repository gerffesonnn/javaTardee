package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a produção foi o nivel de produção?");
        int pd = sc.nextInt();
        if (pd>=1000){
            System.out.println("Meta atingida");}
        else System.out.println("Produção abaixo da meta");

    }
}
