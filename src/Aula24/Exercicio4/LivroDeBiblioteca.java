package Aula24.Exercicio4;

import java.time.LocalDateTime;

public class LivroDeBiblioteca {
    String titulo;
    boolean emprestado;
    String leitor;
    String data;
    String autor;
    String ISBN;

    void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Preço: " + this.data);

        if (this.emprestado) {
            System.out.println("Leitor: " + this.leitor);
        }
    }
}
