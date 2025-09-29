package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Idade");
         int anos = sc.nextInt();
         int meses = anos*12;

        System.out.println(meses + "meses");


    }
}
