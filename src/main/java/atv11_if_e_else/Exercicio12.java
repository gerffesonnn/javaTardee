package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String cv;
        String cv1;
        String cv2;
        System.out.println("voçe possui o crachá valido?");
        cv = sc.nextLine();

        if (cv.equals("sim")){
            System.out.println("voçe possui capacete de segurança?");}
        else System.out.println("Acesso negado");
        cv1 = sc.nextLine();
        if (cv1.equals("sim")){
            System.out.println("Está no turno certo");}
        else System.out.println("Acesso negado");
        cv2 = sc.nextLine();
        if (cv2.equals("sim")){
            System.out.println("Acesso permitido");}
        else System.out.println("Acesso negado");


    }
}
