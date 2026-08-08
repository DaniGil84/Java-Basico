package aula13;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Digite a nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Digite a nota 3: ");
        float nota3 = scanner.nextFloat();
        System.out.println("Digite a nota 4: ");
        float nota4 = scanner.nextFloat();

        float soma = nota1 + nota2 + nota3 + nota4;
        float media = soma / 4.0f;

        System.out.println("Média: " + media);
    }
}
