package aula13;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a metragem do projeto: ");
        double metragem = scanner.nextDouble();
        double lDeTintas = metragem / 3;
        System.out.println("A quantidade de Litros de tinta necessário é: " + lDeTintas);

        double valorLata = 80.00;
        double valorLitro = valorLata /18;
        System.out.println("Valor do litro da tinta é: " + valorLitro);

        double valorProjeto = lDeTintas * valorLitro;
        System.out.println("O Valor do projeto será: " +valorProjeto);

    }
}
