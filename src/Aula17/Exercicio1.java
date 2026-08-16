package Aula17;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Loop
        System.out.println("--- Exercicio 1 Aula 17 ---");
        System.out.println("Informe sua nota");

        double nota = scanner.nextDouble();
        //(nota >= 0 && nota <= 10)

        while(nota <0 || nota >10){
            System.out.println("Nota invalida, digite nota entre 0 a 10.");
            nota = scanner.nextDouble();
        }

    }

}
