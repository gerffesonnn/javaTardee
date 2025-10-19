package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o numero de defeitos?");
        int df = sc.nextInt();
        if (df>=5){
            System.out.println("Lote reprovado");}
        else System.out.println("Lote aprovado");



    }
}
