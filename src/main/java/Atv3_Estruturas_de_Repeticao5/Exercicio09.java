package Atv3_Estruturas_de_Repeticao5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero que deseja saber a tabuada de 1 a 10");
        int ni= sc.nextInt();
        int n1;

        for (int m =1;m<=10;m++){
            n1=ni*m;
            System.out.println(n1);
        }



    }
}
