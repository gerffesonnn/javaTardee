package Ativ15;
import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Random random = new Random();
        int pe = 0, fa = 0,falha;
        while (fa<50 || pe<10000){
            pe+=500;
            falha = random.nextInt(11);
            fa+=falha;
            System.out.println("Numero de peças: " +pe);
            System.out.println("Numero de falhas: " +fa);
        }
        }
    }
