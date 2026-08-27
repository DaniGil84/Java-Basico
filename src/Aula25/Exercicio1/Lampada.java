package Aula25.Exercicio1;

public class Lampada {
    private boolean ligada;
    private String serialNumber;
    private int voltagem;
    private String marca;
    private String cor;
    private String modelo;
    private int temp;

    boolean getLigada(){
        return this.ligada;
    }
    void ligar(){
        this.ligada = true;
    }
    void desligada (){
        this.ligada = false;
    }
    void alternar (){
        this.ligada = !this.ligada;
    }
}
