package Exemplos;

import java.util.Scanner;

public class FunctionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        funcClass fun = new funcClass();

        System.out.println("Enter three numbers");
        fun.a = sc.nextInt();
        fun.b = sc.nextInt();
        fun.c = sc.nextInt();
        int higher = fun.max(fun.a, fun.b, fun.c);
        funcClass.showResult(higher);
        sc.close();


    }
    public static void showResult (int value) {
        System.out.println("Higher = " + value);
}}
