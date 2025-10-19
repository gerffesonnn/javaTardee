package Ativ15;

public class Exercicio09 {
    public static void main(String[] args) {
        int en = 10000;
        int hr = 1;
        while (en<=50000 && hr<=5){
            System.out.println("Consumo de energia durante " +hr+" Horas " +en+ " watts por hora");
            en= en+10000;
            hr= hr+1;
        }
    }
}
