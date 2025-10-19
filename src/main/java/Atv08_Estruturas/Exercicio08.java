package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de óleo?");
        int ol = sc.nextInt();
        if (ol>=30){
            System.out.println("Adicionar óleo");}
        else System.out.println("Nivel adequado");

    }
}
