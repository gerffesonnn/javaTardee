package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura;

        do {
            System.out.println("Digite a temperatura:");
            temperatura = sc.nextInt();

            if (temperatura >= 800 && temperatura <= 1200) {
                System.out.println("Temperatura válida: " + temperatura);
            }

        } while (temperatura < 800 || temperatura > 1200);
    }
}
//Forno industrial: É um equipamento de alta performance usado em cozinhas profissionais e diversas indústrias para processar e aquecer materiais sob altas temperaturas controladas.