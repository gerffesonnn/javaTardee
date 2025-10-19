package Ativ_8.atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String r;
        System.out.println("robo A falhou?");
        r= sc.nextLine();
        if (r.equals("sim"))
        System.out.println("acionar robô B");
        System.out.println("robô B falhou");
        System.out.println("parar a linha");


        }

    }
