package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite a idade");
        int id = sc.nextInt();

        String resp = (id>=16) ? "Pode votar" : "Não pode votar";
        System.out.println(resp);




    }
}
