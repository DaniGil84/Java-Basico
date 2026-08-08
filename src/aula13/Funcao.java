package aula13;

import java.util.Scanner;

public class Funcao{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float nota1 = capturarNota(scanner, "Primeira");
        float nota2 = capturarNota(scanner, "Segunda");
        float nota3 = capturarNota(scanner, "Terceira");
        float nota4 = capturarNota(scanner, "Quarta");

        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4.0f;

        System.out.println("Sua média é: " + media);
    }

    static float capturarNota(Scanner scanner, String ordinal) {
        System.out.println("Digite a " + ordinal + " nota: ");
        float nota = scanner.nextFloat();
        return nota;
    }
}
