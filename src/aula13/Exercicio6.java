package aula13;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio: ");

        float raio = scanner.nextFloat();
        double area = 2.0f * Math.PI * raio * raio;
        System.out.println("O raio é: " + area);
    }
}
