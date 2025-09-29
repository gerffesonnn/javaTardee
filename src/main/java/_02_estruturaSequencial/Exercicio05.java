package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double valor = salario + (salario/100)*10;
        System.out.println("Valor com aumento= " + valor);
    }
}
