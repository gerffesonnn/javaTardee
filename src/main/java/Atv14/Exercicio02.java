package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero");
        int n = sc.nextInt();

        String resp= (n>0) ? n+" é positivo" : (n==0) ? "O número é zero" : n+" é negativo";
        System.out.println(resp);

    }
}
