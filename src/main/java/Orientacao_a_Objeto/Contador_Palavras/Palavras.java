package Orientacao_a_Objeto.Contador_Palavras;

    public class Palavras {
        public static int contar(String frase) {
            if (frase == null || frase.trim().isEmpty()) {
                return 0;
            }
            String[] palavras = frase.trim().split("\\s+");
            return palavras.length;
        }
    }

