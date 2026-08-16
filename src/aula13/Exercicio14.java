package aula13;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o valor total de peixes em kilos? ");
        double peso = scanner.nextDouble();
        double excesso = 0.0;
        double multa = 0.0;
        double multaPorQuilo = 4.0;
        double limitePeso = 50.0;

        if (peso > limitePeso) {
            excesso = peso - limitePeso;
            multa = excesso * multaPorQuilo;
        }

        System.out.println("--- Relatório de pesca. ---");
        System.out.println("Peso informado: " + peso);
        System.out.println("Peso excedente: " + excesso);
        System.out.println("Multa a pagar por excesso de peso: " + multa);

    }

}
