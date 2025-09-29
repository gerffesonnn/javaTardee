package exercicoFixacao;

import java.util.Locale;

public class exercicioFixacao {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure= 53.234567;
        Locale.setDefault(Locale.US);
        System.out.println("Products: " + product1 + ", wich price is $" + price1);
        System.out.printf(product2 + ", wich price is $%.2f%n", price2);
        System.out.println("");
        System.out.println("");
        System.out.println("Record: " + age + " years old, code 5290 and gender: " + gender);
        System.out.println("");
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded(three decimal place): %.3f%n",measure);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}