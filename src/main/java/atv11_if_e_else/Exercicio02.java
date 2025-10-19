package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificação de lote de produção");
        System.out.println("1:aprovado");
        System.out.println("2:reprovado");
        System.out.println("3:retrabalho");
        System.out.println("4:analise manual");
        System.out.println("digite o codigo de entrada da peça");
        int pc = sc.nextInt();

        if (pc==1){
            System.out.println("Aprovado");}
        else if (pc==2) {
            System.out.println("Reprovado");}
        else if (pc==3) {
            System.out.println("Retrabalho");}
            if (pc==4){ System.out.println("Analise manual");}



        }

    }




