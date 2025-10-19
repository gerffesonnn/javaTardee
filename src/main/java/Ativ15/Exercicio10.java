package Ativ15;

import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int tp = random.nextInt(5);
        while (tp<=5){
            System.out.println(tp+ " Falhas");
            tp = tp+1;
        }
        System.out.println("Sistema desligando");
    }
}