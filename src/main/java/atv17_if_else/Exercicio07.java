package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o Peso do pacote");
        int ps = sc.nextInt();
        decisao(ps);
        sc.close();

    }

    public static void decisao(int ps) {


        if (ps<=10){
            System.out.println("leve");} else if (ps<=30) {
            System.out.println("medio");} else if (ps<=60) {
            System.out.println("pesado");}
        else System.out.println("muito pesado");}

}
