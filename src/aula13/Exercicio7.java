package aula13;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o lado: ");

        float lado = scanner.nextFloat();
        double area = lado * lado;
        System.out.println("O lado é: " + 2 * area);
    }
}
