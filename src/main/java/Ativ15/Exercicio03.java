package Ativ15;

public class Exercicio03 {
    public static void main(String[] args) {

        int hr = 1;
        int pd = 50;
        while (pd<=400 && hr<=8){
            System.out.println("Quantidade de produção por "+ hr +" Hora " + pd);
            pd = pd + 50;
            hr = hr + 1;

        }
    }
}
