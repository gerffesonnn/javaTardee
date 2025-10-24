package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int d;
        System.out.println("numero de defeitos");
        d= sc.nextInt();
        decisao(d);
    }

    public static void decisao(int d) {


        if (d>20){
            System.out.println("reprovar");
        } else if (d>10 && d<20) {
            System.out.println("retrabalho");
        } else if (d<10) {
            System.out.println("aprovar");
        }
}
}
