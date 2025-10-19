package Atv16_for;

import java.util.Locale;
import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random=new Random();
        int r= random.nextInt(2000);
        int conta=0;
        int contaa=0;
        for (int d=1;d<=10;d++){
        System.out.println(d+"°previsão de demanda "+" previsão "+r+" unidades");
        r=random.nextInt(2000);
        conta=r+conta;
        contaa=conta/10;}
        System.out.println("previsão média:"+contaa+" unidades");

    }
}
