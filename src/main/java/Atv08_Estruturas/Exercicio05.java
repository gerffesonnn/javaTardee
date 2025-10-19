package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a velocidade?");
        int vl = sc.nextInt();
        if (vl>=120){
            System.out.println("Reduzir velocidade imediatamente!");}
        else System.out.println("Velocidade dentro do limite");



    }
}
