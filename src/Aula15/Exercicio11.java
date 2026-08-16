package Aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Programa de cálculo de reajuste ---");

        System.out.println("Indique seu salário atual");
        double salario = scanner.nextDouble();

        double percentual;

        if (salario <= 280) {
            percentual = 0.2;
        } else if (salario > 280 && salario <= 700) {
            percentual = 0.15;
        } else if (salario > 700 && salario <= 1500) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }


    }
}

