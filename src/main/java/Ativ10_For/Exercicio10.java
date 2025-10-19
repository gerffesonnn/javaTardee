package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();

        int r= random.nextInt(100);
        int ts=0;
        int conta=0;

        for (int d=1; d<=50; d++){
            System.out.println("Teste "+d+" Qualidade "+r);
            r=random.nextInt(100);
            ts=ts+r;
            conta=ts/50;}
        System.out.println("Resultado dos testes de Qualidade "+ ts);
        System.out.println("Total aprovados "+conta+"%");
        }

    }
