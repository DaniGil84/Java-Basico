package Aula15;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Programa de detecção de número e verificar o maior---");

        System.out.println("Informe o primeiro número");
        float a1 = scanner.nextFloat();

        System.out.println("Informe o segundo número");
        float a2 = scanner.nextFloat();

        System.out.println("Informe o segundo número");
        float a3 = scanner.nextFloat();

        if (a1 > a2) {
            System.out.println("O número é maior");
        } else if (a2 > a3) {
            System.out.println("O número é maior");
        } else if (a1 > a3) {
            System.out.println("O número é maior");
        } else {
            System.out.println("O número é maior");
        }

        if (a1 < a2) {
            System.out.println("O número é menor");
        } else if (a2 < a3) {
            System.out.println("O número é menor");
        } else if (a1 < a3) {
            System.out.println("O número é menor");
        } else {
            System.out.println("O número é menor");
        }

    }

}
