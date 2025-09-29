package _01_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double n1= sc.nextDouble();
        double area=pi*Math.pow(n1,2);
        System.out.printf("A= %.4f%n", + area);

    }
}
