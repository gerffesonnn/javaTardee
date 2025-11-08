package Orientacao_a_Objeto.Classificador_Idade;

public class Idade {
    public static String classificar(int idade) {
        if (idade < 0) {
            return "Idade inválida!";
        } else if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Adolescente";
        } else if (idade <= 59) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}
