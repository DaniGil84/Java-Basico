package aula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a metragem do projeto: ");
        double metragem = scanner.nextDouble();
        double lDeTintas = metragem / 6;
        System.out.println("A quantidade de Litros de tinta necessário é: " + lDeTintas);

        double valorLata = 80.00;
        double valorLitro = valorLata /18;
        System.out.println("Valor do litro da tinta na lata é: " + valorLitro);
        double valorGalao= 25.00;
        double litroGalao = valorGalao /3.6;
        System.out.println("Valor do litro da tinta no galão é: " + litroGalao);

        double valorProjetoLata = lDeTintas * valorLitro;
        System.out.println("O Valor do projeto em Latas de tinta será: " +valorProjetoLata);
        double valorProjetoGalao = lDeTintas * litroGalao;
        System.out.println("O Valor do projeto em Galão de tinta será: " + valorProjetoGalao);

    }
}
