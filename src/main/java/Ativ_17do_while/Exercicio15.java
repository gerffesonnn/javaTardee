package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double measurement;

        do {
            System.out.println("Medição da calibragem");
            measurement = scanner.nextDouble();
        } while (measurement < 4.0 || measurement > 20.0);

        System.out.println("Calibração OK: " + measurement + " mA");
    }
}

//Calibração de sensor: É o processo de comparar a medição de um sensor com um padrão de referência conhecido para verificar e ajustar sua precisão e confiabilidade.