package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int metaDiaria = 120;
    int totalPecas = 0;
    int ciclos = 0;

    System.out.println("Célula CNC - Produção de Peças");
    System.out.println("Meta diária: " + metaDiaria + " peças");

    while (totalPecas < metaDiaria) {
        System.out.print("Digite o número de peças do ciclo atual: ");
        int pecasCiclo = scanner.nextInt();

        totalPecas += pecasCiclo;
        ciclos++;

        if (totalPecas < metaDiaria) {
            System.out.println("Ciclo " + ciclos + ": Total atual = " + totalPecas);
        }
    }

    System.out.println("--- Meta atingida ---");
    System.out.println("Total de ciclos: " + ciclos);
    System.out.println("Total de peças produzidas: " + totalPecas);
} // (CNC) sistema de manufatura automatizado que agrupa várias máquinas e equipamentos controlados por computador
}


