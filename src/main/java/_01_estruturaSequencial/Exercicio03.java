package _01_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int resultado;
        resultado=(A*B-C*D);
        System.out.println("DIFERENÇA = " +resultado);

    }
}
