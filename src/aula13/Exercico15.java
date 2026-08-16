package aula13;

import java.util.Scanner;

public class Exercico15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu salário por hora?");
        double salHora = scanner.nextDouble();
        System.out.println("Quantas horas no mes voce trabalhou?");

        double horas = scanner.nextDouble();
        double salBruto = salHora * horas;
        System.out.println ("Seu Saláio Bruto é: " + salBruto);

        double inssTaxa = 0.08;
        double inss = salBruto * inssTaxa;
        System.out.println("O desconto de INSS foi: " + inss);

        double impRendaTaxa = 0.11;
        double ir = salBruto * impRendaTaxa;
        System.out.println("O desconto de IR foi: " + ir);

        double sindTaxa = 0.05;
        double sindicato = salBruto * sindTaxa;
        System.out.println("O desconto de sindicato foi: " + sindicato);

        double descontos = inss + ir + sindicato;
        System.out.println("O valor total de descontos é: " + descontos);

        double salLiquido = salBruto - descontos;
        System.out.println("O salário liquido é: " + salLiquido);

    }
}
