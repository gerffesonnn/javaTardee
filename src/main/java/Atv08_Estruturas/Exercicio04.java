package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o peso da peça?");
        int pc = sc.nextInt();
        if (pc>=5){
            System.out.println("Peça pesada");}
        else System.out.println("Peça leve");


    }
}
