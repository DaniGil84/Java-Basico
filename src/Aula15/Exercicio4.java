package Aula15;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o letra");
        String letra = scanner.nextLine();

        switch (letra) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println(" é uma vogal!");
                break;
            default:
                System.out.println(letra + " é uma consoante!");
                break;
        }
    }
}
