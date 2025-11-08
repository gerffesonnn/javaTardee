package Orientacao_a_Objeto.Calculadora_Simples;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Simples sim = new Simples();

        System.out.print("Digite o primeiro número: ");
        sim.n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        sim.n2 = sc.nextDouble();

        System.out.print("Escolha a operação (+ - * /): ");
        sim.operacao = sc.next();

        sim.calcularResultado();
        sim.mostrarResultado();
    }
}