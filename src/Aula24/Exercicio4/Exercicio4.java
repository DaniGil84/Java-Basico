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

        LivroDeBiblioteca livro2 = new LivroDeBiblioteca();
        livro2.titulo = "Moonwalk";
        livro2.autor = "Michael Jackson";
        livro2.ISBN = "123456789";
        livro2.data = "20_08_2026";
        livro2.emprestado = false;

        livro1.imprimir();
        livro2.imprimir();
    }
}
