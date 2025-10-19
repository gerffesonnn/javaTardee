package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("nivel de tinta");
        r= sc.nextInt();
        if (r<15){
            System.out.println("parar");
        } else if (r>15 && r<50 ) {
            System.out.println("alerta");
        } else if (r>50){
            System.out.println("continuar");
        }
    }
}
