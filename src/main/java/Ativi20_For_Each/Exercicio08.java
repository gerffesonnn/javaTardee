package Ativi20_For_Each;

public class Exercicio08 {
    public static void main(String[] args) {
        double[] temperaturas = {25.5, 30.2, 34.0, 35.1, 32.8, 29.5, 36.0};

        System.out.println("--- Relatório Semanal de Temperaturas ---");

        System.out.println("Temperaturas registradas na semana:");
        for (double temp : temperaturas) {
            System.out.println(temp + " °C");
        }

        System.out.println("\n--- Verificação de Alerta de Calor ---");

        boolean alertaEmitido = false;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] >= 35.0) {
                int dia = i + 1;
                System.out.println("ALERTA: Calor elevado no dia " + dia + "! (" + temperaturas[i] + " °C)");
                alertaEmitido = true;
            }
        }

        if (!alertaEmitido) {
            System.out.println("Nenhuma temperatura atingiu ou ultrapassou 35°C nesta semana.");
        }
    }
}