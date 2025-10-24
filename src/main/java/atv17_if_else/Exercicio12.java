package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("voçe possui o crachá valido?");
        String cv = sc.nextLine().toLowerCase();
        desicao(cv,sc);

    }

    public static void desicao(String cv, Scanner sc) {

        String cv1;
        String cv2;

        if (cv.equals("sim")){
            System.out.println("voçe possui capacete de segurança?");} else if (cv.equals("nao")) {
            System.out.println("Acesso negado");
            return;
        }
        cv1 = sc.nextLine().toLowerCase();
        if (cv1.equals("sim")){
            System.out.println("Está no turno certo?");} else if (cv1.equals("nao")) {
            System.out.println("Acesso negado");
            return;
        }
        cv2 = sc.nextLine().toLowerCase();
        if (cv2.equals("sim")){
            System.out.println("Acesso permitido");} else if (cv2.equals("nao")) {
            System.out.println("Acesso negado");
        }
    }
}
