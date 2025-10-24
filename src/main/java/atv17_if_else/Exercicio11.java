package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel da bateria?");
        int bt = sc.nextInt();
        decisao(bt);
    }

    public static void decisao(int bt) {


        if (bt<20) {
            System.out.println("retorno imediato");} else if (bt<=60) {
            System.out.println("rota curta");}
        else System.out.println("rota longa");
}
}
