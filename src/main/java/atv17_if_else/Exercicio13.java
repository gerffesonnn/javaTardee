package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a produção/hora das peças?");
        int pc = sc.nextInt();
        decisao(pc);
        sc.close();
    }

    public static void decisao(int pc) {
        if (pc<50){
            System.out.println("baixo desempenho");} else if (pc<=100) {
            System.out.println("desempenho regular");}
        else System.out.println("Otimo desempenho");
}
}
