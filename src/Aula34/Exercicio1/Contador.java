package Aula34.Exercicio1;

public class Contador {
    static int contagem = 0;

    Contador(){
        Contador.incrementar();
    }

    static void zerar(){
        contagem = 0;
    }

    static void incrementar(){
        contagem++;
    }

    static int getContagem(){
        return contagem;
    }
}
