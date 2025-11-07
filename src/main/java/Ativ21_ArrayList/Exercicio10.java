package Ativ21_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Exercicio10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite os e-mails separados por vírgula:");
            String linhaEmails = scanner.nextLine();
            scanner.close();

            List<String> listaEmails = new ArrayList<>();

            String[] emailsArray = linhaEmails.split(",");

            for (String email : emailsArray) {
                String emailNormalizado = email.trim().toLowerCase();
                listaEmails.add(emailNormalizado);
            }

            Set<String> emailsUnicosSet = new HashSet<>(listaEmails);

            List<String> emailsUnicosManualmente = new ArrayList<>();
            for (String emailNormalizado : listaEmails) {
                if (!emailsUnicosManualmente.contains(emailNormalizado)) {
                    emailsUnicosManualmente.add(emailNormalizado);
                } else {
                    System.out.println("E-mail duplicado encontrado e ignorado: " + emailNormalizado);
                }
            }

            System.out.println("\n--- E-mails Únicos para Mailing (via for-each): ---");

            for (String emailUnico : emailsUnicosManualmente) {
                System.out.println(emailUnico);
            }
        }
    }


