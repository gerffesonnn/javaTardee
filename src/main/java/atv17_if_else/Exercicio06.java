package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos metros o obstáculo está");
        int ob = sc.nextInt();
        decisao(ob);
        sc.close();
    }

    public static void decisao(int ob) {


        if (ob<5){
            System.out.println("Frear");} else if (ob<=15) {
            System.out.println("Reduzir");}
        else System.out.println("Acelerar");
}
}
