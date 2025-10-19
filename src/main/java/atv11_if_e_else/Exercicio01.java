package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String robo;
        String rb1;
        System.out.println("A frente está livre?");
        robo = sc.nextLine();
        if (robo.equals("sim")){
            System.out.println("O robo segue em frente");}
        else System.out.println("A direita esta livre?");
        rb1 = sc.nextLine();
        if (rb1.equals("sim")){
            System.out.println("O robo vai pra direita");}
        else System.out.println("O robo vai pra esquerda");


    }
}
