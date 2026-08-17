package Aula15;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Programa de detecção de turno ---");

        System.out.println("Indique seu turno");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        String turno = scanner.nextLine().toUpperCase();

        switch (turno) {
            case "M":
            case "m":
            case "Matutino":
                System.out.println("Bom Dia!");
                break;
            case "V":
            case "v":
            case "Vespertino":
                System.out.println("Boa tarde!");
                break;
            case "N":
            case "n":
            case "Noturno":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println(" Valor Inválido!");
                break;
        }
    }
}
