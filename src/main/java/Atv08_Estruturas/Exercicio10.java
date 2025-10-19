package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o peso das caixas?");
        int cx = sc.nextInt();
        if (cx>500){
            System.out.println("Capacidade excedida");}
        else System.out.println("Peso dentro do limite");

    }
}
