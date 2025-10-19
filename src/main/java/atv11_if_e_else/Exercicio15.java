package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura da maquina?");
        int tp = sc.nextInt();

        System.out.println("Qual a vibração?");
        int vb = sc.nextInt();

        if (tp>90 || vb>80) {System.out.println("Desligar maquina");}
        else System.out.println("maquina funcionando normalmente");


    }
}
