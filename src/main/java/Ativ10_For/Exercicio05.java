package Atv16_for;

import java.util.Locale;
import java.util.Random;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();
        int r = random.nextInt(200);
        int conta = 0;
        for (int ch = 1; ch <= 10; ch++) {
            System.out.println("maquina " + ch + ":total de consumo em 24 h :" + r+"kWh");
            r = random.nextInt(200);
            conta = r + conta;


        }
    }}
