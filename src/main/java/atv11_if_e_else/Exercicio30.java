package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int t;
        System.out.println("quanto de temperatura?");
        t= sc.nextInt();
        if (t>80){
            System.out.println("desligar servidores");
        } else if (t>60 && t<80) {
            System.out.println("resfriamento extra");
        } else if (t<60) {
            System.out.println("normal");
        }
    }
}
