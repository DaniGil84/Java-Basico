import exceptions.SaldoInsuficienteException;
import exceptions.ValorNegativoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco da Nonna!");
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        Conta conta = new Conta(nome);

        System.out.println("Olá, " + nome + "!");
        boolean continuarPrograma = true;
        while (continuarPrograma) {
            imprimirOpcoes();
            int opcao = pegarOpcao(scanner);

            switch (opcao) {
                case 0:
                    continuarPrograma = false;
                    break;
                case 1:
                    depositar(scanner, conta);
                    break;
                case 2:
                    sacar(scanner, conta);
                    break;
                case 3:
                    System.out.println("Seu saldo é: " + conta.verSaldo());
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        System.out.println("Volte Sempre!");
    }

    static void depositar(Scanner scanner, Conta conta){
        System.out.println("Quanto deseja depositar?");
        double valor;
        try {
            valor = scanner.nextDouble();
            conta.depositar(valor);
        } catch (InputMismatchException exception) {
            System.out.println("Valor digitado incorreto");
            scanner.nextLine();
        }catch (ValorNegativoException exception){
            System.out.println(exception.getMessage());
        }
    }

    static void sacar(Scanner scanner, Conta conta){
        System.out.println("Quanto deseja sacar?");
        double valor;
        try {
            valor = scanner.nextDouble();
            conta.sacar(valor);
        } catch (InputMismatchException exception) {
            System.out.println("Valor digitado incorreto");
            scanner.nextLine();
        }catch (ValorNegativoException | SaldoInsuficienteException exception){
            System.out.println(exception.getMessage());
        }
    }

    static int pegarOpcao(Scanner scanner) {
        int resultado;
        try {
            resultado = scanner.nextInt();
        } catch (InputMismatchException exception) {
            scanner.nextLine();
            resultado = -1;
        }
        return resultado;
    }

    static void imprimirOpcoes() {
        System.out.println("O que deseja fazer?");
        System.out.println("0 - Encerrar programa.");
        System.out.println("1 - Depositar.");
        System.out.println("2 - Sacar.");
        System.out.println("3 - Ver Saldo.");

    }

}
