package Ativ21_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as tarefas separadas por vírgula:");
        String entrada = sc.nextLine();
        sc.close();

        String[] tarefasArray = entrada.split(",");
        ArrayList<String> tarefas = new ArrayList<String>();

        for (String tarefa : tarefasArray) {
            if (!tarefa.trim().isEmpty()) {
                tarefas.add(tarefa.trim());
            }
        }
        System.out.println("\nLista de Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
}