package Aula47.Exercicio1;

public class ContatoNaoExisteException extends RuntimeException {
    ContatoNaoExisteException(String nome){
        super ("Contato não Existe: " + nome);
    }

}
