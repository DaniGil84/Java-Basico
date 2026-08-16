package Aula15;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Programa de detecção de Feminino e Masculino---");
        System.out.println("Escolha o sexo: F/M");
        String letra = scanner.nextLine();

        switch (letra) {
            case "F":
            case "f":
                System.out.println("Sexo Feminino.");
                break;
            case "M":
            case "m":
                System.out.println("Sexo Masculino.");
                break;
            default:
                System.out.println("Sexo inválido Tente novamente: F/M");
                break;
        }

    }
}
