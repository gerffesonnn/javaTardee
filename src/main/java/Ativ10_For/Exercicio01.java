package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        double conta = 0;
        Locale.setDefault(Locale.US);
        Random random = new Random();
        int r = random.nextInt(100);

        for (int m = 1; m <= 100; m++) {
            System.out.println("Maquina " + m + " Eficiencia "+r+"%");
            r = random.nextInt(100);
            conta = conta+r;
        }
        System.out.println("Media das maquinas: "+conta/100+"%");
    }
}
