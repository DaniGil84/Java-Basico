package Aula47.Exercicio1;

public class AgendaCheiaException extends RuntimeException{
    AgendaCheiaException(int tamanhoMaximo){
        super ("Agenda ja está cheia, Maxima quantidade de contatos = " + tamanhoMaximo);
    }
}
