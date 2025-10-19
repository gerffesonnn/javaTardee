package Atv16_for;

import java.util.Locale;
import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random=new Random();
        int r= random.nextInt(60);
        int conta=0;
        int contaa=0;
        for (int s=1;s<=60;s++){
            System.out.println(s+"° soldagem  tempo  "+r+" minutos");
            r=random.nextInt(60);
            conta=r+conta;
            contaa=conta/60;
        }
        System.out.println("media "+contaa+" minutos");


    }
}
