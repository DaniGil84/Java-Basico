package Aula15;

import java.util.Scanner;

public class Exercico6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Programa de detecção de número ---");

        System.out.println("Informe o primeiro número");
        float numero1 = scanner.nextFloat();

        System.out.println("Informe o segundo número");
        float numero2 = scanner.nextFloat();

        System.out.println("Informe o segundo número");
        float numero3 = scanner.nextFloat();

        System.out.println("O 1º número é: " + numero1 + ", o 2º número é: " + numero2 + ", o 3º número é: " + numero3);

    }
}
