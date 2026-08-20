package aula13;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Exercício 17 ----");
        System.out.println("Area a ser pintada(m²): ");
        double metragem = scanner.nextDouble();
        double qtdLitros = metragem / 6;
        System.out.println("A quantidade de Litros de tinta necessário é: " + qtdLitros);

        double qtdLatas = Math.ceil(qtdLitros / 18);
        double precoLatas = qtdLatas * 80;
        System.out.println("a - Quantidade de latas necessárias é : " + qtdLatas);
        System.out.println("Preço das latas : " + precoLatas);

        double qtdGalao = Math.ceil(qtdLitros / 3.6);
        double precoGaloes = qtdGalao * 25;
        System.out.println("b - Valor do litro da tinta no galão é: " + qtdGalao);
        System.out.println("Preço dos galões : " + precoGaloes);

        double qtdLitroFolga = 1.1 * qtdLitros;
        System.out.println("c -Valor do litros com folga necessário: " + qtdLitroFolga);

        //Cenario1
        double qtdLatasFolga = Math.ceil(qtdLitroFolga / 18);
        double precoLatasFolga = qtdLatasFolga * 80;

        //Cenario2
        double qtdLatasMix = Math.floor(qtdLitroFolga / 18);
        double qtdGaloesMix = Math.ceil((qtdLitroFolga - qtdLatasMix * 18) / 3.6);
        double precoLatasMix = qtdLatasMix * 80;
        double precoGaloesMix = qtdGaloesMix * 25;
        double precoMix = precoLatasMix + precoGaloesMix;

        if (precoLatasFolga > precoMix) {
            System.out.println("Quantidade de latas necessárias: " + qtdLatasFolga);
            System.out.println("Preço dos latas: " + precoLatasFolga);
        } else {
            System.out.println("Quantidade de latas necessárias: " + qtdLatasMix);
            System.out.println("Preço das latas: " + precoLatasMix);
            System.out.println("Quantidade de galões necessários: " + qtdGaloesMix);
            System.out.println("Preço dos galões: " + precoGaloesMix);
            System.out.println("Preço Total: " + precoMix);
        }
    }
}
