package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo;
        System.out.println("O codigo deve conter (8 caracteres) para o codigo ser aceito");

        do {
            System.out.println("Digite o codigo");
            codigo = scanner.next();
        } while (codigo.length() != 8);
        System.out.println("Código aceito");
    }
}
/*Código RFID: É um sistema de identificação por radiofrequência que utiliza etiquetas com um microchip e antena para armazenar e transmitir dados de forma sem fio.*/