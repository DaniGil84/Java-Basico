package Aula15;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Programa de detecção de produto ---");

        System.out.println("Informe o valor do 1º produto");
        float prod1 = scanner.nextFloat();
        System.out.println("1º produto: " + prod1);

        System.out.println("Informe o valor do 2º produto");
        float prod2 = scanner.nextFloat();
        System.out.println("2º produto: " + prod2);

        System.out.println("Informe o valor do 3º produto");
        float prod3 = scanner.nextFloat();
        System.out.println("3º produto: " + prod3);

        System.out.println("O 1º produto  é: " + prod1 + ", o 2º produto é: " + prod2 + ", o 3º produto é: " + prod3);

        float menor = prod1;

        if (prod2 < menor) {
            menor = prod2;
        }
        if (prod3 < menor) {
            menor = prod3;
        }
        System.out.println("O menor produto digitado foi: " + menor);


    }


}
