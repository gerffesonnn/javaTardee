package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String r;
        System.out.println("robo A falhou?");
        r= sc.nextLine();
        desicao(r,sc);
    }

    public static void desicao(String r,Scanner sc) {

        String r1;

        if (r.equals("sim")){
            System.out.println("Acionar robo B");}
        else System.out.println("robo B falhou?");
        r1= sc.nextLine();
        if (r1.equals("sim")){
            System.out.println("parar linha");}
        else System.out.println("Continuando com a produção");
        }

    }
