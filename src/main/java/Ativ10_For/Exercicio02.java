package Ativ10_For;

import java.util.Locale;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Random random = new Random();
        int conta = 0;
        int contaa = 0;
        int r = random.nextInt(400);

        for (int h=1; h<=720; h++){
            System.out.println("minuto "+h+ " "+r+"°");
            r=random.nextInt(400);
            conta = conta +r;
            contaa =conta/720;
        }
        System.out.print("media de graus é :"+ contaa+ "°");
        }



    }
