package Aula15;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Programa de detecção de número e verificar o maior---");

        System.out.println("Informe o 1º número");
        float num1 = scanner.nextFloat();

        System.out.println("Informe o 2º número");
        float num2 = scanner.nextFloat();

        System.out.println("Informe o 3º número");
        float num3 = scanner.nextFloat();

        double maior = num1;
        double menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

    }

}
