package aula13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + "m são " + centimetros + "cm.");

    }
}
