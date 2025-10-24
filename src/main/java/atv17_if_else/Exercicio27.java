package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String p;
        System.out.println("qual o nivel de erro?");
        System.out.println("erro critico, erro moderado ou sem erro?");
        p= sc.nextLine();
        decisao(p);
    }

    public static void decisao(String p) {


        if (p.equals("erro critico")){
            System.out.println("parar linha");
        } else if (p.equals("erro moderado")) {
            System.out.println("acionar manutencao");
        } else if (p.equals("sem erro")) {
            System.out.println("continuar producao");
        }
}
}
