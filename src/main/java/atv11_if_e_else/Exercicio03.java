package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nivel de energia da maquina");
        int en = sc.nextInt();

        if (en<=30){ System.out.println("Modo econômico");} else if (en<=70) {
            System.out.println("Modo normal");}
        else System.out.println("Modo turbo");

        }


    }