package Aula25.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Exercicio 3 - Aula 25");

        System.out.println("Escreva o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Escreva a matricula do aluno: ");
        String matricula = scanner.nextLine();
        System.out.println("Escreva o curso do aluno: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula, curso);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "ª disciplina");
            String disciplina = scanner.nextLine();
            aluno.adicionarDisciplinas(i, disciplina);

            System.out.println("Digite o valor da " + (i + 1) + "ª nota");
            float nota = scanner.nextFloat();
            aluno.adicionarNota(i, nota);
            scanner.nextLine();
        }

        System.out.println("----------------------------------");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        for (int i = 0; i < 3; i++) {
            String mensagemAprovacao;
            if (aluno.verificarAprovacao(aluno.getDisciplinas()[i])) {
                mensagemAprovacao = "Aprovado";
            } else {
                mensagemAprovacao = "Reprovado";
            }
            System.out.println(aluno.getDisciplinas()[i] + ": " + aluno.getNotas()[i] + " - " + mensagemAprovacao);
        }


    }
}
