package Aula15;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Programa de detecção de maior número ---");

        System.out.println("Informe o primeiro número");
        float numero1 = scanner.nextFloat();

        System.out.println("Informe o segundo número");
        float numero2 = scanner.nextFloat();

       System.out.println("O 1º número é: " + numero1 + ", o 2º número é: " + numero2);

    }
}
