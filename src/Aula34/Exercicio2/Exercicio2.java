package Aula34.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        double exemploSoma = Calculadora.somar(1, 2);
        System.out.println("O resultado da Soma é: " + exemploSoma);

        double exemploMultiplicacao = Calculadora.multiplicar(2, 3);
        System.out.println("O resultado da Multiplicação é: " + exemploMultiplicacao);

        double exemploDivisao = Calculadora.dividir(10, 2);
        System.out.println("O resultado da Divsão é: " + exemploDivisao);

        double exemploElevacaoPotencia = Calculadora.elevarPotencia(4, 2);
        System.out.println("O resultado da POtência é: " + exemploElevacaoPotencia);
    }

}
