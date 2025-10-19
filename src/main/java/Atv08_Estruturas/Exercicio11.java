package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String operador;
        System.out.println("O operador foi detectado?");
        operador= sc.nextLine();
        if (operador.equals("sim")){
            System.out.println("Pausar linha de produção");}
        else System.out.println("Linha operando normalmente");


    }
}
