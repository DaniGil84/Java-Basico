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


        // Inicializa o maior e o menor com o primeiro valor
        double maior = num1;
        double menor = num1;

        // Verificação do maior número
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        // Verificação do menor número
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Exibição do resultado
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        /*if (a1 > a2) {
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
        }*/

    }

}
