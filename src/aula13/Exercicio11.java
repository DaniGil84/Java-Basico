package aula13;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o numero 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o numero real: ");
        int numReal = scanner.nextInt();

        float a = ( 2 * num1) * (num2 / 2);
        float b = (3 * num1) + numReal;
        float c = numReal * numReal * numReal;

        System.out.println("Resultado de a: " + a);
        System.out.println("Resultado de b: " + b);
        System.out.println("Resultado de c: " + c);

    }

}
