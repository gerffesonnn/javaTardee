package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String op;
        System.out.println("Qual o operador");
        op = sc.nextLine();
        
        if (op.equals("basico")){
            System.out.println("ACESSO RESTRITO");} else if (op.equals("supervisor")) {
            System.out.println("ACESSO PARCIAL");}
        else System.out.println("ACESSO TOTAL");
            
        }
    }
