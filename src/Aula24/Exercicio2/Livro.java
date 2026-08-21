package Aula24.Exercicio2;

public class Livro {
    String editora;
    String titulo;
    String autor;
    int pages;
    String ISBN;
    String categoria;


    void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Autor: " + this.autor);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Pages: " + this.pages);
        System.out.println("ISBN: " + this.ISBN);

    }
}
