package Atv14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numero de horas trabalhadas");
        int h = sc.nextInt();
        System.out.println("insira o valor por hora trabalhada");
        double v= sc.nextDouble();
        double salario =h*v;
        String resp=(salario>2000) ? "salario bom" : "salario ruim";
        System.out.println(resp);
}}
