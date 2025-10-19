package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("quanto de intensidade eletrica?");
        s= sc.nextInt();
        if (s<100){
            System.out.println("fraca");
        } else if (s>100 && s<200) {
            System.out.println("media");
        } else if (s>200) {
            System.out.println("forte");
        }
    }
}
