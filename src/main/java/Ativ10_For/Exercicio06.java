package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();

        int r=random.nextInt(500);
        int es =0;
        int conta= 0;


        for (int mes=1; mes<=30; mes++){
            System.out.println("Dia "+mes+" Consumo de materiais "+r);
            r= random.nextInt(500);
            es=es+r;
            conta=es/30;}
        System.out.println("Estoque Medio de Materiais "+ conta);



        }

    }
