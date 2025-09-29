package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = Math.pow(raio,2) * 3.14;

        System.out.println("Àrea=" + area);


    }
}
