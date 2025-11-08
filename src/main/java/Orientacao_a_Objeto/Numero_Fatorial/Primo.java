package Orientacao_a_Objeto.Numero_Fatorial;

public class Primo {

    public static boolean ePrimo(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
