package Ativ_17do_while;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {



        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
            int caixasEntregues = 0;
            int numeroViagens = 0;
            int caixasNestaViagem;

            do {
                numeroViagens++;
                System.out.print("Digite a quantidade de caixas entregues na viagem " + numeroViagens + ": ");
                caixasNestaViagem = scanner.nextInt();
                caixasEntregues += caixasNestaViagem;
            } while (caixasEntregues < 50);

            System.out.println("Viagens: " + numeroViagens + " | Caixas: " + caixasEntregues);
            scanner.close();//AGV pode significar Automated Guided Vehicle (Veículo Guiado Automatizado), um tipo de robô móvel usado para transportar materiais em ambientes como fábricas e armazéns
        }
    }


