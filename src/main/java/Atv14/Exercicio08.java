package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a sua idade");
        int id = sc.nextInt();

        String resp = (id<12) ? "Infantil" : (id<18) ? "Juvenil" : "Adulto";
        System.out.println(resp);


    }
}
