package Aula24.Exercicio2;

import Aula24.Exercicio3.LivroDeLivraria;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("---- L I V R O - 1 ----");
        Livro livro1 = new Livro();
        livro1.editora = "Sextante";
        livro1.titulo = "A última música";
        livro1.autor = "Nicholas Sparks";
        livro1.pages = 415;
        livro1.ISBN = "123456789";
        livro1.categoria = "Romance";

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Editora: " + livro1.editora);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Categoria: " + livro1.categoria);
        System.out.println("Pages: " + livro1.pages);
        System.out.println("ISBN: " + livro1.ISBN);


        System.out.println("---- L I V R O - 2 ----");
        Livro livro2 = new Livro();
        livro2.editora = "Estética Torta";
        livro2.titulo = "MoonWalk";
        livro2.autor = "Michael Jackson";
        livro2.pages = 320;
        livro2.ISBN = "741258963";
        livro2.categoria = "Biografia";

        livro2.imprimir();

    }
}