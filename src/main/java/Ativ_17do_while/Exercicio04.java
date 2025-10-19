package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);
    int opcao;

    do {
        System.out.println("--- Menu Painel MES ---");
        System.out.println("1. Registrar parada");
        System.out.println("2. Registrar produção");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Parada registrada.");
                break;
            case 2:
                System.out.println("Produção registrada.");
                break;
            case 3:
                System.out.println("Encerrando menu.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
        System.out.println();
    } while (opcao != 3);

    sc.close(); //Painel de Controle do Sistema de Execução de Manufatura (do inglês, Manufacturing Execution System - MES).
}
}


