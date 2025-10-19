package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de eficiencia?");
        int ef = sc.nextInt();
        if (ef>=85){
            System.out.println("Eficiencia aceitavel");}
        else System.out.println("Manutenção recomentada");
    }
}
