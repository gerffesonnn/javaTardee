package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();

        int r = random.nextInt(500);
        int conta=0;


        for (int mes=1; mes<=12; mes++){
            System.out.println("Mes "+mes+" Tempo de operação das maquinas "+r);
            r= random.nextInt(500);
            conta=conta+r;}
        System.out.println("Total de horas de operação "+conta);

        }

    }
