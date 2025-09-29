package _02_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      int C = sc.nextInt();
      int F = (C * 9/5) + 32;

        System.out.println(F + "°F GRAUS");
    }
}
