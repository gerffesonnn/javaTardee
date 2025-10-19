package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario");
        int sl = sc.nextInt();

        String resp = (sl>5000) ? "O imposto é de 20%" : "O imposto é de 10%";
        System.out.println(resp);
    }
}
