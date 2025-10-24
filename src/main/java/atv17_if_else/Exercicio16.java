package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String p;
        System.out.println(" qual é o defeito encontrado nas peças?");
        System.out.println("visivel,microscopico,ausente");
        p = sc.nextLine();
        desicao(p);
        sc.close();
    }
    public static void desicao(String p) {
        if (p.equals("visivel"))
            System.out.println("nivel alto");
        else if (p.equals("microscopico"))
            System.out.println("nivel medio");
        else {
            System.out.println("nivel baixo");}
        }
    }
