package aula13;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1;
        float num2;


        System.out.println("Digite a numero 1: ");
        num1 = scanner.nextFloat();
        System.out.println("Digite a numero 2: ");
        num2 = scanner.nextFloat();
        System.out.println("A soma é: ");

        float soma = num1 + num2;

        System.out.println(soma);

    }
}
