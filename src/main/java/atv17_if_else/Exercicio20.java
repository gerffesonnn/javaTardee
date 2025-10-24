package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("qual é a hora do funcionario?");
        t = sc.nextInt();
        decisao(t);
    }

    public static void decisao(int t) {


        if (t <= 12) {
            System.out.println("manhã");
        } else if (t > 12 && t <= 18) {
            System.out.println("tarde");}
        else if (t>=18) {
            System.out.println("noite");}
}
}
