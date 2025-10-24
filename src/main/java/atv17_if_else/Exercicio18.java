package atv17_if_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int Es;
        System.out.println("Quanto de energia solar disponivel?");
        Es = sc.nextInt();
        decisao(Es);
        sc.close();
    }
    public static void decisao(int Es) {
        if (Es > 70) {
            System.out.println("Usar solar");
        } else if (Es > 30 && Es <= 70) {
            System.out.println("Hibrido");
        } else {
            System.out.println("Usar outra fonte (ex: rede eletrica)");
        }
    }
}
