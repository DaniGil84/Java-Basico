package Aula47.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    final int tamanhoMaximo = 3;
    List<Contato> contatos;

    Agenda(){
        this.contatos = new ArrayList<>();

    }

    void adicionar (Contato contato){
        if (this.contatos.size() >= tamanhoMaximo){
            throw new AgendaCheiaException(tamanhoMaximo);
        }
        this.contatos.add(contato);
    }

    Contato consultar(String nome){
        for(Contato contato: this.contatos){
            if(contato.getNome().equals(nome)){
                return contato;
            }

        }
        throw new ContatoNaoExisteException(nome);
    }
}
