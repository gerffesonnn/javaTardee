package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numero");
        int n= sc.nextInt();
        String resp=(n%2==0) ? "par" : "ímpar";
        System.out.println(resp);
    }
}
