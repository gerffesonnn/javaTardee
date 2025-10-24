package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura?");
        int io = sc.nextInt();
        decisao(io);

    }

    public static void decisao(int io) {


        if (io<0) System.out.println("Alerta de congelamento");
        else if (io<=40) {
            System.out.println("Normal");}
        else System.out.println("Alerta superaquecimento");
}
}
