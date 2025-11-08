package Orientacao_a_Objeto.JurosCompostos;

public class Compostos {

    public static double calcular(double capital, double taxa, int periodos) {
        double montante = capital;
        int i = 0;

        while (i < periodos) {
            montante += montante * (taxa / 100);
            i++;
        }

        return montante;
    }
}

