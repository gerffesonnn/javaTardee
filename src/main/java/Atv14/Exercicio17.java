package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("insira temperatura");
        int t= sc.nextInt();
        String resp=(t>30)? "quente": "frio";
        System.out.println(resp);
    }
}
