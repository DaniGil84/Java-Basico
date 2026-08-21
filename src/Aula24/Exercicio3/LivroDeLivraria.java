package Aula24.Exercicio3;

public class LivroDeLivraria {
    String editora;
    String titulo;
    String autor;
    int pages;
    String ISBN;
    String categoria;
    double preco;
    String livraria;

    void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Pages: " + this.pages);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Preço: " + this.preco);
        System.out.println("Livraria: " + this.livraria);
    }
}
