package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("digite o numero");
        int n= sc.nextInt();
        String resp =(n<0) ? "negativo" : (n>=1) ? "positivo" : "zero";
        System.out.println(resp);
    }
}
