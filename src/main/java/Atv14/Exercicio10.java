package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        int dv = sc.nextInt();

        String resp = (dv%3==0) ? "Divisível" : "Não divisível";
        System.out.println(resp);
    }
}
