package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas a maquina tem");
        int mq = sc.nextInt();
        decisao(mq);
        sc.close();

    }

    public static void decisao(int mq) {



        if (mq<500){
            System.out.println("Urgencia baixa");} else if (mq<=1000) {
            System.out.println("Urgencia média");}
        else System.out.println("Urgencia alta");
}
}
