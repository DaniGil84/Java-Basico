package aula13;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura em Celsius: ");
        float celsius = scanner.nextFloat();
        float farenheit = (celsius*9/5+32);

        System.out.println("A Temperatura em Celsius é: " + farenheit);
    }
}
