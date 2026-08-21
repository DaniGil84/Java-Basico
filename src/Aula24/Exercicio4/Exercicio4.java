package Aula24.Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("---- Empréstimo de livro ----");
        LivroDeBiblioteca livro1 = new LivroDeBiblioteca();
        livro1.titulo = "A última música";
        livro1.autor = "Nicholas Sparks";
        livro1.ISBN = "123456789";
        livro1.data = "20_08_2026";
        livro1.leitor = "Gabriel";
        livro1.emprestado = true;


        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("ISBN: " + livro1.ISBN);
        System.out.println("Preço: " + livro1.data);
        System.out.println("Livraria: " + livro1.leitor);
        System.out.println("Livraria: " + livro1.emprestado);

    }
}
