package Orientacao_a_Objeto.Conversor_Temperatura;

public class Temperatura {


    public double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
