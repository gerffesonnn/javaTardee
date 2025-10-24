package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ei;
        System.out.println("quantidade de produtos");
        ei= sc.nextInt();
        decisao(ei);
    }

    public static void decisao(int ei) {


        if (ei<10){
            System.out.println("reabastecer urgente");
        }
        else if (ei>10 && ei<30) {
            System.out.println("alerta");
        } else if (ei>=30) {
            System.out.println("normal");
        }
}
}
