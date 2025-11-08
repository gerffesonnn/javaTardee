package Orientacao_a_Objeto.Calculadora_Simples;

public class Simples {
    public double n1;
    public double n2;
    public double resultado;
    public String operacao;

    public void calcularResultado() {
        if (operacao.equalsIgnoreCase("+")) {
            resultado = somar(n1, n2);
        } else if (operacao.equalsIgnoreCase("-")) {
            resultado = subtrair(n1, n2);
        } else if (operacao.equalsIgnoreCase("*")) {
            resultado = multiplicar(n1, n2);
        } else if (operacao.equalsIgnoreCase("/")) {
            resultado = dividir(n1, n2);
        } else {
            System.out.println("Operação inválida!");
            resultado = 0;
        }
    }

    public void mostrarResultado() {
        System.out.println("Resultado: " + resultado);
    }

    public static double somar(double x, double y) {
        return x + y;
    }

    public static double subtrair(double x, double y) {
        return x - y;
    }

    public static double multiplicar(double x, double y) {
        return x * y;
    }

    public static double dividir(double x, double y) {
        if (y == 0) {
            System.out.println("Erro: divisão por zero");
            return 0;
        }
        return x / y;
    }
}

