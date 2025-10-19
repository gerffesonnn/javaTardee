package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("insira um numero");
        int n= sc.nextInt();
        String resp=(n%5==0) ? "multiplo de 5" : "não é multiplo de 5";
        System.out.println(resp);
    }
}
