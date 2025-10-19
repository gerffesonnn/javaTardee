package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de energia do robo");
        int in = sc.nextInt();
        if (in>=50){
            System.out.println("Robô iniciando pintura");}
        else System.out.println("Maquina operando normalmente");

    }
}
