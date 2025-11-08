package Orientacao_a_Objeto.Calculadora_Media;

public class Media {
    public static double calcularMedia(double[] notas) {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}