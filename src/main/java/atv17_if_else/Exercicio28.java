package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String t;
        System.out.println("como se encontra o transporte?");
        System.out.println("entrada bloqueada,transito alto ou senao");
        t= sc.nextLine();
        decisao(t);
    }

    public static void decisao(String t) {


        if (t.equals("entrada bloqueada")){
            System.out.println("recalcular rota");
        } else if (t.equals("transito alto")) {
            System.out.println("rota alternativa");
        } else if (t.equals("senao")) {
            System.out.println("seguir normal");
        }
}
}
