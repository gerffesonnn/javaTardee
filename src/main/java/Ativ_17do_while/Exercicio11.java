package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double umidade;

        do {
            System.out.println("Insira a umidade (%)");
            umidade = scanner.nextDouble();
        } while (umidade < 30 || umidade > 55);

        System.out.println("Umidade aceita: " + umidade + "%");
    }
}
//O Controle de Umidade no estoque de matéria-prima: É o processo de gerenciar e manter os níveis de umidade relativa do ar dentro de uma faixa ideal para preservar a qualidade, a integridade e a validade dos materiais estocados.