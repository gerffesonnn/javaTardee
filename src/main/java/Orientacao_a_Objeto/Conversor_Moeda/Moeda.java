package Orientacao_a_Objeto.Conversor_Moeda;

public class Moeda {
    private static final double COTACAO_DOLAR = 5.2;
    private static final double COTACAO_EURO = 5.8;

    public static double realParaDolar(double r) {
        return r / COTACAO_DOLAR;
    }

    public static double realParaEuro(double r) {
        return r / COTACAO_EURO;
    }

    public static double dolarParaReal(double d) {
        return d * COTACAO_DOLAR;
    }

    public static double euroParaReal(double e) {
        return e * COTACAO_EURO;
    }
}

