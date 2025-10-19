package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a qualidade final de peças?");
        int pc = sc.nextInt();
        if (pc<90){
            System.out.println("Qualidade abaixo do padrão");}
        else System.out.println("Qualidade aceitavel");
    }
}
