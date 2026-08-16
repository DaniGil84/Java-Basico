package Aula15;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Programa de detecção de maior número positivo ou negativo ---");

        System.out.println("Informe o número");
        float numero1 = scanner.nextFloat();

        if(numero1 > 0){
            System.out.println("O número " + numero1 + " é positivo.");
        }else{
            System.out.println(" número " + numero1 + " é negativo.");
        }

    }
}
