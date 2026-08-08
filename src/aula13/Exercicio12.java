package aula13;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua altura: ");;
        float altura = scanner.nextFloat();
        double media = (72.7 * altura) - 58;
        System.out.println("Seu peso ideial é: " + media);

    }
}
