package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int vi;
        System.out.println("verificar carga");
        vi= sc.nextInt();
        if (vi<500){
            System.out.println("permitido");}
        else if (vi>500 && vi<1000) {
            System.out.println("alerta");}
        else if (vi>1000) {
            System.out.println("proibido");}
    }
}
