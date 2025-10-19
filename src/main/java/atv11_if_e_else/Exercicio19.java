package atv11_if_e_else;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int pH;
        System.out.println("quanto de ph presente na substancia?");
        pH = sc.nextInt();
        if (pH < 7) {
            System.out.println("acido");
        } else if (pH == 7) {
            System.out.println("neutro");
        } else if (pH > 7) {
            System.out.println("basico");
        }
    }}
