package _01_estruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int resultado;
        resultado = n1 + n2;

        System.out.println("SOMA = " + resultado);
    }
}
