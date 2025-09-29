package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int resultado = n1 / n2;
        int resto = n1%n2;

        System.out.println(resultado + "," + resto);
    }
}
