package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de energia captado?");
        int en = sc.nextInt();
        if (en<200){
            System.out.println("Acionar energia auxiliar");}
        else System.out.println("Energia solar suficiente");

    }
}
