package Atv08_Estruturas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a temperatura da maquina");
        int ot = sc.nextInt();
        if (ot>=80){
            System.out.println("Alerta: Máquina desligada por superaquecimento");}
        else System.out.println("Máquina operando normalmente");
        };

    }
