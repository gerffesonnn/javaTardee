package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade restante");
        int ip = sc.nextInt();

        if (ip<20) System.out.println("trocar");
        else System.out.println("continuar");
    }
}
