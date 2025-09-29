package Exemplos;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        double premio;
        premio = 100000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o maior planeta do sistema solar? ");
        System.out.println("A) Terra");
        System.out.println("B) Marte");
        System.out.println("C) Júpter"); //RESPOSTA
        System.out.println("D) Saturno");
        String texto = sc.nextLine();

        if (texto.equalsIgnoreCase("C")) {
            System.out.println("Você escolheu a letra: " + texto);
            System.out.println("Parabéns, você acertou!");
            premio = premio + 100000;
            System.out.printf("Você acumolou R$ " + premio + " até agora.");
            Scanner sc2 = new Scanner(System.in);

            System.out.println(" Qual é o país conhecido como Terra do Sol Nascente? ");
            System.out.println("A) China");
            System.out.println("B) Japão"); //RESPOSTA
            System.out.println("C) Índia");
            System.out.println("D) Coreia do Sul");
            String texto2 = sc.nextLine();

        }else if (texto.equalsIgnoreCase("B")) {
                System.out.println("Você escolheu a letra: " );
                System.out.println("Parabéns, você acertou!");
                premio = premio+100000;
            }
        else {
            System.out.println("Você escolheu a letra: " + texto);
            System.out.println("Sua resposta está errada.");
            System.out.println("Você acumolou R$ " + premio + ".");
            System.out.println("Parabéns Você ganhou!");
        }
    }
}
