package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de estoque?");
        int est = sc.nextInt();
        if (est<=20){
            System.out.println("Reabastecer imediatamente");}
        else System.out.println("Estoque suficiente");


    }
}
