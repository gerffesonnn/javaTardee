package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o operador");
        String op = sc.nextLine();
        processarDecisao(op);
        sc.close();

    }

    public static void processarDecisao(String op) {
        if (op.equals("basico")){
            System.out.println("ACESSO RESTRITO"); }
        else if (op.equals("supervisor")) {
            System.out.println("ACESSO PARCIAL");
        }
        else System.out.println("ACESSO TOTAL");




}}
