package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o indice de defeito");
        int lo = sc.nextInt();
        decisao(lo);
    }

    public static void decisao(int lo) {


        if (lo<10){ System.out.println("Acione alerta");}
        else System.out.println("Lote aprovado");
}
}
