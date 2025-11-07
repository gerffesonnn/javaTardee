package Ativi20_For_Each;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os e-mails separados por vírgula:");
        String linhaEmails = scanner.nextLine();

        List<String> emailsProcessados = Arrays.stream(linhaEmails.split(","))
                .map(email -> email.trim().toLowerCase())
                .collect(Collectors.toList());

        System.out.println("\nE-mails processados:");
        for (String email : emailsProcessados) {
            System.out.println(email);
        }

        List<String> emailsUnicos = new ArrayList<>();
        for (String email : emailsProcessados) {
            if (!emailsUnicos.contains(email)) {
                emailsUnicos.add(email);
            }
        }

        System.out.println("\nE-mails únicos:");
        for (String email : emailsUnicos) {
            System.out.println(email);
        }

        scanner.close();
    }
}