package Ativ_17do_while;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int pieces = 0;
        int weight;

        do {
            System.out.println("Insira o peso (g)");
            weight = scanner.nextInt();
            sum += weight;
            pieces++;
        } while (sum < 500);
        System.out.println("Limite atingido");
        System.out.println("Peças: " + pieces + " | Peso total: " + sum + " g");

    }
}
//Impressora 3D: É um dispositivo que fabrica objetos tridimensionais a partir de um modelo digital, usando o processo de manufatura aditiva, ou seja, adicionando material em camadas sucessivas.