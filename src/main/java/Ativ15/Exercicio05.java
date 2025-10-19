package Ativ15;

public class Exercicio05 {
    public static void main(String[] args) {
        int ps = 0;
        while (ps<=120){
            System.out.println("A pressão da maquina é de " + ps+ " PSI");
            ps=ps+10;
        }
        System.out.println("A maquina atingiu a pressão maxima");
    }
}
