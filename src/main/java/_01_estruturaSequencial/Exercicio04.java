package _01_estruturaSequencial;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario;
        int horasTrabalhadas;
        double valorPorHora;
        double salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

    }
}
