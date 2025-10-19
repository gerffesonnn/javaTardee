package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = sc.nextInt();

        String resp = (n1>n2) ? "O primeiro numero é maior" : (n1<n2) ? "O segundo numero é maior" : "Os dois numeros posuem o mesmo valor";
        System.out.println(resp);


    }
}
