package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos itens foram detectados");
        int it = sc.nextInt();
        decisao(it);
    }

    public static void decisao(int it) {
        if (it<=5) {System.out.println("Velocidade lenta");}
        else if (it<=15) {
            System.out.println("Velocidade media");}
        else System.out.println("Velocidade rapida");
}
}
