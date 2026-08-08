package aula13;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura em Farenheit: ");
        float Farenheit = scanner.nextFloat();
        float Celsius = (Farenheit-32)*5/9;

        System.out.println("A Temperatura em Celsius é: " + Celsius);

    }
}
