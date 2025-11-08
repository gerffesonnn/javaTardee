package Orientacao_a_Objeto.Calculadora_Fatorial;

public class Fatorial {

    public static long calcular(int n) {
        long fatorial = 1;
        int i = n;

        while (i > 1) {
            fatorial *= i;
            i--;
        }

        return fatorial;
    }
}
