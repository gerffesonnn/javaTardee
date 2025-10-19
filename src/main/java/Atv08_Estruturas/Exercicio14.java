package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o numero de peças?");
        int pc = sc.nextInt();
        if (pc<=0){
            System.out.println("Erro: Verificar robô");}
        else System.out.println("Montagem em andamento");
    }
}
