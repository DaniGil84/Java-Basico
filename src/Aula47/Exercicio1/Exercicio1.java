package Aula47.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Aula 47 - Exercicio 1 ---");
        boolean sairDoPrograma = false;


        while(!sairDoPrograma){
            imprimirOpcoes();
            int opcao = scanner.nextInt();
            switch (opcao){
                case 0:
                    sairDoPrograma = true;
                    break;
                case 1:
                    // adicionar precisa de try/catch
                    break;
                case 2:
                    // consultar - Preca de try/catch
                    break;
                default:
                    System.out.println("Opcao Inválida!");
                    break;
            }
            System.out.println("");

        }
    }

    static void imprimirOpcoes(){
        System.out.println("O que deseja fazer?");
        System.out.println("0 - Sair do Programa");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Consultar contato");
    }
}
