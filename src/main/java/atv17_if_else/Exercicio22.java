package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qa;
        System.out.println("quanto de particulas se encontra o ar?");
        qa = sc.nextInt();
        decisao(qa);
    }

    public static void decisao(int qa) {


        if (qa < 50) {
            System.out.println("bom");}
        else if (qa > 50 && qa <= 100) {
            System.out.println("moderado");}
        else if (qa>=100 && qa<=200) {
            System.out.println("ruim");
        } else if (qa>=200) {
            System.out.println("critico");

        }
}
}
