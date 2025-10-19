package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();

        int r = random.nextInt(50);
        int conta = 0;
        int contaa = 0;

        for (int pr =1; pr<=200; pr++){
            System.out.println("Peça "+pr+" defeitos "+r);
            r=random.nextInt(50);
            conta=r+conta;
            contaa=conta/200;}
        System.out.println("total de defeitos " + conta+ " porcentagem de defeitos "+ contaa+"%");


        }


    }
