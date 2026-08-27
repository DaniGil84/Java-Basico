package Aula47.Exercicio1;

public class Contato {
    static int contador = 0;

    private String nome;
    private String telefone;
    private int ID;

    Contato (){
        Contato.contador++;
        this.ID = Contato.contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
