package Atv16_for;

import java.util.Locale;
import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();
        int r = random.nextInt(800);
        int conta = 0;
        int contaa = 0;
        for (int pd = 1; pd <= 30; pd++) {
            System.out.println("dia " + pd + " producao do dia " + r);
            r=random.nextInt(800);
            conta=r+conta;
            contaa=conta/30;


        }  System.out.println("total de peças produzidas no periodo de 30 dias "+conta + " peças");
        System.out.println("media diaria de peças "+ contaa);


        }
    }
