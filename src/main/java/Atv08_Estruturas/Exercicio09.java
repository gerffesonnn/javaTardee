package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de material?");
        int mt = sc.nextInt();
        if (mt>0){
            System.out.println("Impressora iniciada");}
        else System.out.println("Sem material disponivel");


    }
}
