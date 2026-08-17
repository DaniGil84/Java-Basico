package Aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();

        double percentual;

        if (salarioAtual <= 280.00) {
            percentual = 20;
        } else if (salarioAtual < 700.00) {
            percentual = 15;
        } else if (salarioAtual < 1500.00) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double valorAumento = salarioAtual * (percentual / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("\n--- RESUMO DO REAJUSTE ---");
        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + (int)percentual + "%");
        System.out.printf("Valor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f\n", novoSalario);


    }
}

