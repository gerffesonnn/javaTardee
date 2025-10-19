package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int sr;
        System.out.println("qual é o nivel de trafego suspeito");
        sr= sc.nextInt();
        if (sr>70){
            System.out.println("bloquear acesso");
        } else if (sr>30 && sr<70) {
            System.out.println("alerta");
        } else if (sr<30) {
            System.out.println("normal");
        }


    }

}
