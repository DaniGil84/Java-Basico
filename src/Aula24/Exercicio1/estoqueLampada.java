package Aula24.Exercicio1;

public class estoqueLampada {
    Lampada lampada;
    int qtdd;

    void imprimir(){
        System.out.println("SerialNumber: " + this.lampada.serialNumber);
        System.out.println("Marca: " + this.lampada.marca);
        System.out.println("Tipo: " + this.lampada.tipo);
        System.out.println("Voltagem: " + this.lampada.voltagem);
        System.out.println("Preço: " + this.lampada.preco);
        System.out.println("Temperatura: " + this.lampada.temp);
        System.out.println("Potência: " + this.lampada.potencia);
        System.out.println("Quantidade de estoque: " + this.qtdd);
    }


}
