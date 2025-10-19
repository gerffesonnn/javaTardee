package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.println("insira idade");
        int i= sc.nextInt();
        String resp= (i>=16) ? "pode votar" : "não pode votar";
        System.out.println(resp);
    }

}
