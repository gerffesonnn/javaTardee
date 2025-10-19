package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("insira seu salario");
        int d= sc.nextInt();
        String resp = (d>= 3000) ? "salario alto": "salario baixo";
        System.out.println(resp);

    }
}
