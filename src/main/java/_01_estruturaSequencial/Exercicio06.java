package _01_estruturaSequencial;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio06{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double TRIANGULO = (A * C)/2;
        double CIRCULO = (C * C) * 3.14159;
        double TRAPEZIO = ((A + B) * C)/2;
        double QUADRADO = B * B;
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n " , TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n " , CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n " , TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n " , QUADRADO);
        System.out.printf("RETANGULO: %.3f%n " , RETANGULO);

    }
}
