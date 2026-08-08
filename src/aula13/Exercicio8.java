package aula13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quando voce ganha por hora: ");
        float hora = scanner.nextFloat();
        System.out.println("Quantas horas você trabalha no mês: ");
        float mes = scanner.nextFloat();

        float total = hora * mes;
        System.out.println("Seu salário é: " + total);
    }
}
